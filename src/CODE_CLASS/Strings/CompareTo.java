package CODE_CLASS.Strings;

public class CompareTo {
    public static void main(String[] args) {
        String s1 = "Apple";
        String s2 ="Ringkhang";

//        int value = (int) 'b';
//        System.out.println(value);

        System.out.println(compareTo(s1,s2));
//        System.out.println(s1.compareTo(s2));
    }

    public static int compareTo(String s1, String s2){

        int len1 = s1.length()-1;
        int len2 = s2.length()-1;

        int i = 0 , j = 0;

        while (i<=len1 && j<=len2){
            if (s1.charAt(i) == s2.charAt(j)){
                i++;
                j++;
            }else {
                return (int) s1.charAt(i)- (int) s2.charAt(j);
            }
        }

        return len1-len2;
    }
}
