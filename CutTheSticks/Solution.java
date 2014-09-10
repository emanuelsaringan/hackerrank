import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[in.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(arr.length);
        int minIdx = 0;
        while (minIdx < arr.length) {
            int min = arr[minIdx];
            while (minIdx < arr.length && arr[minIdx] <= min) {
                minIdx++;
            }

            if (minIdx >= arr.length) {
                break;
            }

            System.out.println(arr.length - minIdx);
        }
    }
}
