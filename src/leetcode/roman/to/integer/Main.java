package leetcode.roman.to.integer;

public class Main {

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("III"));       // 3
        System.out.println(romanToInteger.romanToInt("IX"));        // 9
        System.out.println(romanToInteger.romanToInt("LVIII"));     // 58
        System.out.println(romanToInteger.romanToInt("MCMXCIV"));   // 1994
    }
}
