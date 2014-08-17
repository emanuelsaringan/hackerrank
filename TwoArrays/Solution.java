import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            int K = in.nextInt();

            List<Integer> A = new ArrayList<Integer>(N);
            List<Integer> B = new ArrayList<Integer>(N);

            for (int j = 0; j < N; j++) {
                A.add(in.nextInt());
            }

            for (int j = 0; j < N; j++) {
                B.add(in.nextInt());
            }

            Collections.sort(B);

            for (int j = 0; j < N; j++) {
                boolean found = false;
                for (int k = 0; k < B.size(); k++) {
                    int aVal = A.get(j);
                    int bVal = B.get(k);
                    
                    if (aVal + bVal >= K) {
                        B.remove(k);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    break;
                }
            }

            if (B.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
