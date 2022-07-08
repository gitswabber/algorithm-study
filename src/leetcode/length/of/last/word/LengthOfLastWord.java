package leetcode.length.of.last.word;

// https://leetcode.com/problems/length-of-last-word/
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        char[] charArrays = s.toCharArray();
        char space = ' ';
        boolean isFirstSpace = true;
        int count = 0;

        for (int i = s.length() - 1; i > -1; i--) {
            if (charArrays[i] == space) {
                if (isFirstSpace) {
                    continue;
                } else {
                    break;
                }
            }
            count++;
            isFirstSpace = false;
        }
        return count;
    }
}