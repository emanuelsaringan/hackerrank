import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int c = 0; c < T; c++) {
            int N = in.nextInt();
            int K = in.nextInt();

            int[] arr = new int[N];
            int curNum = 0;
            for (int i = 1; i < arr.length; i += 2) {
                arr[i] = curNum++;
            }

            for (int i = arr.length % 2 == 0 ? arr.length - 2 : arr.length - 1; i >= 0; i -= 2) {
                arr[i] = curNum++;
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == K) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
