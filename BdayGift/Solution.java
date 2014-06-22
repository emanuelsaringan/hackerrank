import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0.0;
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            total += in.nextInt();
        }
        
        System.out.printf("%.1f\n", total / 2.0);
    }
}
