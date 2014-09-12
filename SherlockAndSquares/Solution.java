import java.util.*;

public class Solution {
    private static final int MAX = 1000000000;

    public static void main(String[] args) {
        // Map a square n to the number of squares less or equal to n
        Map<Integer, Integer> squares = new HashMap<Integer, Integer>();
        int curSquare = 0;
        int curDiff = 1;
        while (curSquare + curDiff <= MAX) {
            curSquare += curDiff;
            squares.put(curSquare, squares.size() + 1);
            curDiff += 2;
        }

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int A = in.nextInt();
            int B = in.nextInt();

            int lowIdx = A;
            int highIdx = B;
            while (lowIdx <= B) {
                if (squares.containsKey(lowIdx)) {
                    break;
                }

                lowIdx++;
            }

            while (highIdx >= A) {
                if (squares.containsKey(highIdx)) {
                    break;
                }

                highIdx--;
            }

            if (lowIdx > highIdx) {
                System.out.println(0);
            } else {
                System.out.println(squares.get(highIdx) - squares.get(lowIdx) + 1);
            }
        }
    }
}
