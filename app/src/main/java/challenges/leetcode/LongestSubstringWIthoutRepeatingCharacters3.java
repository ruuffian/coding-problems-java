package challenges.leetcode;

import java.util.HashMap;

public class LongestSubstringWIthoutRepeatingCharacters3 {
    public static void main() {
        System.out.println(new LongestSubstringWIthoutRepeatingCharacters3().lengthOfLongestSubstring("abcabcabc"));
    }

    public int lengthOfLongestSubstring(String s) {
        int max = 0, i;
        for (i = 0; i < s.length(); i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            int j;
            for (j = i; j < s.length(); j++) {
                if (map.putIfAbsent(s.charAt(j), j) != null) {
                    break;
                }
            }
            if (j - i > max)
                max = j - i;
        }
        return max;
    }
}
