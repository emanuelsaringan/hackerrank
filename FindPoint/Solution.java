import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int px = in.nextInt();
            int py = in.nextInt();
            int qx = in.nextInt();
            int qy = in.nextInt();
            
            System.out.println((2 * qx - px) + " " + (2 * qy - py));
        }
    }
}
