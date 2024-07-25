public class Sieve_of_erathonesis {
    public static void main(String[] args) {
        int n = 31;
        func(n);
    }
    public static void func(int n){
        boolean []prime = new boolean[n+1];
        for(int i = 2;i<=n;i++){
            prime[i] = false;
        }

        for(int i=2;i*i<=n;i++){
            if(prime[i] == false){
                for(int j = i*i;j<=n;j+=i){
                    prime[j] = true;
                }
            }
        }

        for(int i=2;i<=n;i++){
            if(prime[i] == false){
                System.out.print(i + " ");
            }
        }
    }
}
