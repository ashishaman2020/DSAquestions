package PATTERNS;

public class pattern {

    public static void pattern3(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n){
        for(int i=0;i<n;i++){
//            Printing the spaces.
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
//            Printing the stars
            for(int j=0;j<(2*i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n){
        for(int i=0;i<n;i++){
            for (int j =0; j<i; j++)
            {
                System.out.print(" ");
            }

            // For printing the stars in each row
            for(int j=0;j< 2*n -(2*i +1);j++){

                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
//        pattern3(n);
//        pattern5(n);
//        pattern7(n);
        pattern8(n);
    }
}
