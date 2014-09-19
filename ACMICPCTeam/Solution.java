import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        
        BitSet[] bits = new BitSet[N];
        for (int i = 0; i < N; i++) {
            BitSet bit = new BitSet();
            String bitStr = in.next();
            for (int j = 0; j < bitStr.length(); j++) {
                if (bitStr.charAt(j) == '1') {
                    bit.set(j);
                }
            }
            
            bits[i] = bit;
        }
        
        int maxBits = 0;
        int numTeams = 0;
        for (int i = 0; i < bits.length; i++) {
            for (int j = i + 1; j < bits.length; j++) {
                BitSet curBit = (BitSet) bits[i].clone();
                curBit.or(bits[j]);
                
                int numBits = curBit.cardinality();
                if (numBits > maxBits) {
                    maxBits = numBits;
                    numTeams = 1;
                } else if (numBits == maxBits) {
                    numTeams++;
                }
            }
        }
        
        System.out.println(maxBits);
        System.out.println(numTeams);
    }
}
