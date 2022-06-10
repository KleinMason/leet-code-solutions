import java.util.HashSet;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        int longest = lengthOfLongestSubstring("dvdf");
        System.out.println(longest);
    }

    public static int lengthOfLongestSubstring(String s) {   
        int l = 0, result = 0;
        Set<Character> set = new HashSet<Character>();
        for (int r = 0; r < s.length(); r++) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            result = Math.max(result, r - l + 1);
        }
        return result;
    }
}