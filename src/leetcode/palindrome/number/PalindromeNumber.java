package leetcode.palindrome.number;

// https://leetcode.com/problems/palindrome-number/
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int number = x;
        int reversedNumber = 0;

        while (true) {
            int ten = 10;

            reversedNumber += (number % ten);
            number = number / ten;

            if (number == 0) break;

            reversedNumber *= ten;
        }

        return reversedNumber == x;
    }
}
