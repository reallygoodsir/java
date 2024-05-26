package exceptions.six;

import java.util.ArrayList;

public class Sixth {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(15);
        a.add(2);
        a.add(77);
//         a.add(15); // same number exception
        try{
            processList(a);
            System.out.println("all good");
        }catch (Exception exception){
            System.out.println("exception invoked (exception message: \"" + exception.getMessage() + "\")");
        }
    }

    public static void processList(ArrayList<Integer> numbers) throws Exception{
        for(int i = 0; i < numbers.size(); i++){
            for(int j = i+1; j < numbers.size(); j++){
                if(numbers.get(i) == numbers.get(j)){
                    throw new Exception("SAME NUMBER ERROR");
                }
            }
        }
    }
}
