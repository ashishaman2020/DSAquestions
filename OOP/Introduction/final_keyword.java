package OOP.Introduction;

public class final_keyword {
    public static class student{
        String name;
        int roll;
        float marks;
        student(){
            this.name = "Ashish";
            this.roll = 1;
            this.marks = 29.4f;
        }
    }

    static class A{
        final int num = 10;
        String name;
        public A(String name) {
            this.name = name;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("This is how finalise is used");
        }
    }

    public static void main(String[] args) {
//        final int age = 13;
//        System.out.println(age);

        final student s1 = new student();
        System.out.println(s1.name);
        s1.name = "Aman";
        System.out.println(s1.name);
    }
}
