package CODE_CLASS.Strings;


import java.util.Arrays;

/***
 * Given an input string s, reverse the order of the words.
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 * Return a string of the words in reverse order concatenated by a single space.
 *
 * Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should
 * only have a single space separating the words. Do not include any extra spaces.
 *
 * Example 1:
 *
 * Input: s = "the sky is blue"
 * Output: "blue is sky the"
 * Example 2:
 *
 * Input: s = "  hello world  "
 * Output: "world hello"
 * Explanation: Your reversed string should not contain leading or trailing spaces.
 */

// https://leetcode.com/problems/reverse-words-in-a-string/description/
public class ReverseWords {
    public static void main(String[] args) {
        String str = "the sky is   blue      ";


//        System.out.println(Arrays.toString(str.trim().split("\\s+"))); // remove and separate string by whitespaces

        System.out.println(reverseWords(str));
    }

    public static String reverseWords(String s) {

        String[] str = s.trim().split("\\s+");

        int len = str.length-1;

        String ans = "";

        for (int i = len; i >0 ; i--) {
            ans += str[i] + " ";
        }

        return ans+str[0];

        // BY USING STRING BUILDER

//        String[] str = s.trim().split("\\s+");
//
//        int len = str.length-1;
//
//        StringBuilder ans = new StringBuilder();
//
//
//        for (int i = len; i >0 ; i--) {
//            ans.append(str[i]).append(" ");
//        }
//
//        return ans+str[0];
    }
}
