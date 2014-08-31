import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[in.nextInt()];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        
        System.out.println(is(Arrays.copyOf(arr, arr.length)) - qs(Arrays.copyOf(arr, arr.length), 0, arr.length));
    }
    
    private static final int is(int[] arr) {
        int total = 0;
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            int cur = arr[j];
            while (j > 0 && arr[j - 1] > cur) {
                arr[j] = arr[j - 1];
                j--;
                total++;
            }
            
            arr[j] = cur;
        }
        
        return total;
    }
    
    private static final int qs(int[] arr, int l, int h) {
        if (l >= h - 1) {
            return 0;
        }
        
        int total = 0;
        int pivot = arr[h - 1];
        int midIdx = l;
        for (int i = l; i < h; i++) {
            if (arr[i] <= pivot) {
                int temp = arr[midIdx];
                arr[midIdx] = arr[i];
                arr[i] = temp;
                
                total++;
                midIdx++;
            }
        }
        
        return total + qs(arr, l, midIdx - 1) + qs(arr, midIdx, h);
    }
}
