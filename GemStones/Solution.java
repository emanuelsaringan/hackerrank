import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        Scanner in = new Scanner(System.in);

        int cases = in.nextInt();

        String line = in.next();
        int lineLen = line.length();
        for (int i = 0; i < lineLen; i++) {
            set.add(line.substring(i, i + 1));
        }

        List<String> unusedChars = new ArrayList<String>();

        for (int i = 1; i < cases; i++) {
            line = in.next();

            unusedChars.clear();
            for (String c : set) {
                if (!line.contains(c)) {
                    unusedChars.add(c);
                }
            }

            set.removeAll(unusedChars);
        }

        System.out.println(set.size());
    }
}
