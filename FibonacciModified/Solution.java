import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  public static void main(String args[]) throws Exception {
    Scanner in = new Scanner(System.in);
    BigInteger t1 = in.nextBigInteger();
    BigInteger t2 = in.nextBigInteger();
    BigInteger[] arr = new BigInteger[in.nextInt()];
    arr[0] = t1;
    arr[1] = t2;
    for (int i = 2; i < arr.length; i++) {
      arr[i] = arr[i - 1].multiply(arr[i - 1]).add(arr[i - 2]);
    }
    System.out.println(arr[arr.length - 1]);
  }
}
