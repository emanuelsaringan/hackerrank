import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            long result = 1;
            for (int j = 1; j < N; j++) {
                result = (result * in.nextLong()) % 1234567;
            }
            
            System.out.println(result);
        }
    }
}
