import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> output = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        StringBuilder binString = new StringBuilder();
        
        
        int T = in.nextInt();
        
        for (int i = 0; i < T; i++) {
            int n = in.nextInt();
            String line = in.next();
            
            output.clear();
            
            int limit = (int) Math.pow(2, n);
            for (int j = 1; j < limit; j++) {
                sb.setLength(0);
                binString.setLength(0);
                
                binString.append(Integer.toBinaryString(j));
                while (binString.length() != n) {
                    binString.insert(0, "0");
                }
                
                for (int k = 0; k < binString.length(); k++) {
                    if (binString.charAt(k) == '1') {
                        sb.append(line.charAt(k));
                    }
                }
                
                output.add(sb.toString());
            }
            
            Collections.sort(output);
            
            for (String str : output) {
                System.out.println(str);
            }
        }
    }
}
