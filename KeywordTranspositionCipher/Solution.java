import java.util.*;

public class Solution {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int c = 0; c < N; c++) {
            String keyword = in.next();
            in.nextLine();  // Garbage
            String ciphertext = in.nextLine();
            
            System.out.println(solve(keyword, ciphertext));
        }
    }

    private static final String solve(String keyword, String ciphertext) {
        String cleanKeyword = clean(keyword);
        int cleanKeywordLen = cleanKeyword.length();
        char[][] grid = new char[27][cleanKeywordLen];

        for (int i = 0; i < cleanKeywordLen; i++) {
            grid[0][i] = cleanKeyword.charAt(i);
        }

        int idx = cleanKeywordLen;
        for (int i = 0; i < ALPHABET.length(); i++) {
            char curChar = ALPHABET.charAt(i);
            if (cleanKeyword.indexOf(curChar) < 0) {
                grid[idx / cleanKeywordLen][idx % cleanKeywordLen] = curChar;
                idx++;
            }
        }

        char[] cleanKeywordChars = cleanKeyword.toCharArray();
        Arrays.sort(cleanKeywordChars);
        StringBuilder substitutionBuffer = new StringBuilder();
        for (int i = 0; i < cleanKeywordChars.length; i++) {
            char curChar = cleanKeywordChars[i];
            idx = cleanKeyword.indexOf(curChar);
            for (int j = 0; j < grid.length && grid[j][idx] != '\0'; j++) {
                substitutionBuffer.append(grid[j][idx]);
            }
        }

        String substitution = substitutionBuffer.toString();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < ciphertext.length(); i++) {
            char curChar = ciphertext.charAt(i);
            if (curChar == ' ') {
                result.append(' ');
            } else {
                int substitutionIdx = substitution.indexOf(curChar);
                result.append(ALPHABET.charAt(substitutionIdx));
            }
        }

        return result.toString();
    }

    private static final String clean(String keyword) {
        StringBuilder sb = new StringBuilder();
        Set<Character> chars = new HashSet<Character>();
        for (int i = 0; i < keyword.length(); i++) {
            char curChar = keyword.charAt(i);
            if (!chars.contains(curChar)) {
                chars.add(curChar);
                sb.append(curChar);
            }
        }

        return sb.toString();
    }
}
