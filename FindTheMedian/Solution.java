import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            pq.offer(in.nextInt());
        }

        int limit = n >> 1;
        for (int i = 0; i < limit; i++) {
            pq.poll();
        }

        System.out.println(pq.peek());
    }
}
