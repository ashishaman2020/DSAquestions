package OOP.Introduction;

import java.util.Arrays;

public class classes {
    public static class student{

        public student(){
//            Calling another constructor from this constructor.
            this("Ashish", 24, 98);
        }

        public student(String name, int rollno, float marks) {
            this.name = name;
            this.rollno = rollno;
            this.marks = marks;
        }

        String name;
        int rollno;
        float marks;
    }
    public static void main(String[] args) {
        student[] Students = new student[5];

//        student s1 = new student();
//        System.out.println(Arrays.toString(Students));

        student s1 = new student("AS", 12, 23);
        System.out.println(s1.name);
    }
}
