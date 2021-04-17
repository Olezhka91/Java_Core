package ua.lviv.lgs.Task_1;

public class Application {
    public static void main(String [] args){
        Cat myCat = new Cat();
        Dog myDog = new Dog();
        Cow myCow = new Cow();

        myCat.voice();
        myDog.voice();
        myCow.voice();
    }
}
