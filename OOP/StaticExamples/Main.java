package OOP.StaticExamples;

public class Main {
    public static void main(String[] args) {
//        Human h1 = new Human(20, "Ashish", 50000, false);
//        Human h2 = new Human(21, "Mohit", 60000, true);
//
//        System.out.println(Human.population);
//        System.out.println(Human.population);

//        fun();
        Main obj = new Main();
        obj.fun2();
    }

    static void fun(){
        Main obj = new Main();
        obj.greeting();
    }

    void fun2() {
        greeting();
    }

    void greeting() {
        System.out.println("Hello world!");
    }
}
