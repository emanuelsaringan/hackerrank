import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(pairs(arr, K));
    }

    private static final int pairs(int[] a, int k) {
        int total = 0;
        Set<Integer> aSet = new HashSet<Integer>();
        
        for (int i = 0; i < a.length; i++) {
            aSet.add(a[i]);
        }
        
        for (int i = 0; i < a.length; i++) {
            int val = a[i];

            if (aSet.contains(val + k)) {
                total++;
            }
            
            if (aSet.contains(val - k)) {
                total++;
            }
        }
        
        return total >> 1;
    }
}
