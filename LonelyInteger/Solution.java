import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int res = in.nextInt();
        for (int i = 1; i < N; i++) {
            res ^= in.nextInt();
        }
        
        System.out.println(res);
    }
}
