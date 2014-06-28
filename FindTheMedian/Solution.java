import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        PriorityQueue<Integer> left = new PriorityQueue<Integer>(n, Collections.reverseOrder());
        PriorityQueue<Integer> right = new PriorityQueue<Integer>(n);
        
        left.offer(in.nextInt());
        for (int i = 1; i < n; i++) {
            int num = in.nextInt();
            
            if (right.isEmpty()) {
                if (num <= left.peek()) {
                    right.offer(left.poll());
                    left.offer(num);
                } else {
                    right.offer(num);
                }
                
                continue;
            }
            
            if (left.size() == right.size()) {
                if (num >= right.peek()) {
                    left.offer(right.poll());
                    right.offer(num);
                } else {
                    left.offer(num);
                }
            } else {
                if (num >= right.peek()) {
                    right.offer(num);
                } else {
                    right.offer(left.poll());
                    left.offer(num);
                }
            }
        }
        
        System.out.println(left.peek());
    }
}
