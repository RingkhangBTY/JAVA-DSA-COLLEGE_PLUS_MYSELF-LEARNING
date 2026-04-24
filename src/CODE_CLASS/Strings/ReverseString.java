package CODE_CLASS.Strings;

public class ReverseString {
    public static void main(String[] args) {

        String str = "Ringkhang";

        System.out.println(reverseString(str));
    }

    public static String reverseString(String s){
        StringBuilder ans = new StringBuilder();

        for (int i = s.length()-1; i >= 0 ; i--) {
            ans.append(s.charAt(i));
        }

        return ans.toString();
    }
}
