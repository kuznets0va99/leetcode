import java.util.ArrayList;
import java.util.List;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int left = 0;
        List<Character> unique = new ArrayList<>();
        for (int right = left; right < s.length(); right++){
            if (unique.contains(s.charAt(right)) == false){
                unique.add(s.charAt(right));
                if (res < unique.size()){
                    res = unique.size();
                }
            }
            else{
                while (unique.contains(s.charAt(right))){
                    unique.remove(0);
                    left ++;
                }
                unique.add(s.charAt(right));
            }
        }
        return res;
    }

    public static void main(String[] args){
        System.out.println(new Solution().lengthOfLongestSubstring("dvdf"));
        System.out.println(new Solution().lengthOfLongestSubstring("bbbbb"));
        System.out.println(new Solution().lengthOfLongestSubstring("pwwkew"));
    }
}