package OOP.polymorphism;

public class Main {
    public static void main(String[] args) {
        shapes sh = new shapes();
        circle c = new circle();
//        square sq = new square();
        shapes sssh = new square();

        sssh.area();
    }
}
