package CODE_CLASS.Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharFrequencyInOrderOfOccurrence {

    public static void main(String[] args) {
        String s = "geeksforgeeks";

        System.out.println(getCharFrequencyInOrderOfOccurrence(s));
    }

    private static String getCharFrequencyInOrderOfOccurrence(String s) {
        StringBuilder sb = new StringBuilder();

        Map<Character,Integer> frequencies = new LinkedHashMap<>();

//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//
//            if (!frequencies.containsKey(c)){
//                frequencies.put(c,1);
//            }else {
//                int count = frequencies.get(c);
//                count++;
//                frequencies.replace(c,count);
//            }
//        }
//
//        for (Character key : frequencies.keySet()){
//            sb.append(key + frequencies.get(key)).append(" ");
//        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            frequencies.put(c, frequencies.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : frequencies.entrySet()) {
            sb.append(entry.getKey())
                    .append(entry.getValue())
                    .append(" ");
        }

        return sb.toString().trim();
    }
}