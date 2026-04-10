package MYSELF_LEARN.TEMP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Strings {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';

        char z = 'z';

        System.out.println((int)a);
        System.out.println((int)z);
        System.out.println((int) z - (int)a);

        Map<Integer,Character> map = new HashMap<>();

        map.put(1,'c');

        System.out.println(map.containsValue('c'));
        System.out.println(map.size());
//        map.clear();
        System.out.println(map);

    }
}
