package leetcode.roman.to.integer;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/roman-to-integer/
public class RomanToInteger {

    final private Map<Character, Integer> romanToIntegerMap = new HashMap<>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int result = 0;

        for (int i = 0; i < chars.length; i++) {

            int current = romanToIntegerMap.get(chars[i]);

            if (i + 1 < chars.length) {
                int next = romanToIntegerMap.get(chars[i + 1]);
                if (current < next) {
                    result += (next - current);
                    i++;
                } else {
                    result += current;
                }
            } else {
                result += current;
            }
        }

        return result;
    }
}
