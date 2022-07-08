package leetcode.two.sum;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/two-sum/
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> numsMap = new HashMap<>();
        Map<Integer, Integer> matchedNumsMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int matchedNum = target - current;

            if (matchedNumsMap.get(current) != null) {
                result[0] = matchedNumsMap.get(current);
                result[1] = i;
                return result;
            }

                numsMap.put(current, i);
                matchedNumsMap.put(matchedNum, i);
        }

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int matchedNum = target - current;
            if (numsMap.get(matchedNum) != null) {
                result[0] = numsMap.get(matchedNum);
                result[1] = i;
                return result;
            }
        }

        return result;
    }
}
