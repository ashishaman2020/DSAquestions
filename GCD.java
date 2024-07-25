public class GCD {
    public static void main(String[] args) {
        int a = 20, b = 40;
        System.out.println(findgcd(a, b));
    }
//    public static void findgcd(int a, int b){
//        if((a > 0) && (b > 0)){
//            if(a > b){
//                a = a % b;
//            }else{
//                b = b % a;
//            }
//            if(a == 0){
//                System.out.println(b);
//            }else{
//                System.out.println(a);
//            }
//        }
//    }

    public static int findgcd(int a, int b){
        if(a == 0){return b;}
        if(b == 0) {
            return a;
        }

        if(a == b){
            return a;
        }

        if(a > b){
            return findgcd(a % b, b);
        }
        return findgcd(b % a, a);
    }
}
