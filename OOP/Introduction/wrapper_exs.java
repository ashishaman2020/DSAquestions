package OOP.Introduction;

public class wrapper_exs {
    public static void main(String[] args) {
//        Integer num = 45;
//        System.out.println(num);

//        Use case ex
        Integer a = 10;
        Integer b = 20;
        swap(a,b);
        System.out.println(a +" " + b);

    }
    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}
