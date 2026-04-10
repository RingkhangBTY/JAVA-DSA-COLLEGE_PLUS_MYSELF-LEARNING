package MYSELF_LEARN.Strings.Problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongestSubStringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int ans = 0 ;

        int len = s.length();

        if(len==0){
            return 0;
        }else if(len == 1){
            return 1;
        }

        Set<Character> characterSet = new HashSet<>();

        for (int i = 0; i < len ; i++) {
            for (int j = i; j < len; j++) {
                if (characterSet.contains(s.charAt(j))){
                    ans = Math.max(ans,characterSet.size());
                    characterSet.clear();
                    break;
                }else{
                    characterSet.add(s.charAt(j));
                    ans = Math.max(ans,characterSet.size());
                }
            }
            characterSet.clear();
        }

        return ans;
    }
}
