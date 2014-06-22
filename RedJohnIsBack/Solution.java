import java.util.*;

public class Solution {
    private static final int[] mem = new int[41];
    
    public static void main(String[] args) {
        // Initialize memoization table
        mem[0] = 0;
        mem[1] = 1;
        mem[2] = 1;
        mem[3] = 1;
        mem[4] = 2;
        for (int i = 5; i <= 40; i++) {
            mem[i] = mem[i - 1] + mem[i - 4];
        }
        
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            System.out.println(solve(mem[in.nextInt()]));
        }
    }
    
    private static final int solve(int n) {
        int primeCount = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                primeCount++;
            }
        }
        
        return primeCount;
    }
    
    private static final boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        
        if (n % 2 == 0) {
            return false;
        }
        
        int limit = (int) Math.sqrt(n);
        for (int i = 3; i <= limit; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
