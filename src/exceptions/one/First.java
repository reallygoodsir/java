package exceptions.one;

public class First {
    public static void main(String[] args){
        try{
            throw new Exception("catch this\n");
        }catch (Exception e){
            System.out.println("caught");
        }
    }
}
