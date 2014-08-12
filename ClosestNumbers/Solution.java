import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff == minDiff) {
                System.out.print(arr[i - 1] + " " + arr[i] + " ");
            }
        }
    }
}
