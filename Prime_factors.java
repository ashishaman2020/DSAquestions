import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Prime_factors {
    public static void main(String[] args) {
        int n = 40;
        primeFactors(n);
    }
    public static void primeFactors(int n) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                ans.add(i);
                while (n % i == 0) {
                    n = n / i;
                }
            }
        }
        if (n != 1) {
            ans.add(n);
        }
        for (int it : ans) {
            System.out.print(it + " ");
        }
    }
}
