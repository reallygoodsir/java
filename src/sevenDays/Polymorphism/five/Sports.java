package sevenDays.Polymorphism.five;

public class Sports {
    void play(){
        System.out.println("Sports play");
    }
}


class Football extends Sports{
    @Override
    void play() {
        System.out.println("Football play");
    }
}

class Basketball extends Sports{
    @Override
    void play() {
        System.out.println("Basketball play");
    }
}

class Rugby extends Sports{
    @Override
    void play() {
        System.out.println("Rugby play");
    }
}