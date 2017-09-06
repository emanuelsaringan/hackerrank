import java.io.*;
import java.util.*;

public class Solution {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    ArrayList<ArrayList<Integer>> seqList = new ArrayList<ArrayList<Integer>>();
    for (int i = 0; i < N; i++) {
      seqList.add(new ArrayList<Integer>());
    }
    int Q = in.nextInt();
    int lastAnswer = 0;
    int a, x, y;
    while (Q-- > 0) {
      a = in.nextInt();
      x = in.nextInt();
      y = in.nextInt();
      ArrayList<Integer> seq = seqList.get((x ^ lastAnswer) % N);
      if (a == 1) {
        seq.add(y);
      } else {
        lastAnswer = seq.get(y % (seq.size()));
        System.out.println(lastAnswer);
      }
    }
  }
}
