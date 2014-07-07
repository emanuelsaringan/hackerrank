import java.util.*;

public class Solution {
    private static final int MOD = 1000000007;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            long n = in.nextLong();
            long nMod = (n % MOD);
            System.out.println((nMod * nMod) % MOD);
        }
    }
}
