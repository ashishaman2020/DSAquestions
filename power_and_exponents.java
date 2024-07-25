public class power_and_exponents {
    public static void main(String[] args) {
        int x = 2, n = 5;

//        If n is negative we just do 1/ans at the end.
        int m = n;

        int ans = 1;
        while(n > 0){
            if(n % 2 == 1){
                ans = ans * x;
                n = n-1;
            }else{
                n = n/2;
                x = x * x;
            }
        }
        if(m < 0)ans = 1/ans;
        System.out.println(ans);
    }
}
