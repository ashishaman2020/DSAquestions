package OOP.StaticExamples;

public class innerClasses {
    static class Test{
        String name;
        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Ashish");
        Test b = new Test("Aman");
    }
}
