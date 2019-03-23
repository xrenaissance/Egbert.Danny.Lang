package GoogleTag;

public class MissingNumberI {
    // using oxr operation to get missing number
    public int missingNumberSolution1(int[] nums) {
        int res = nums.length;
        for (int i = 0; i < nums.length; i++){
            res ^= i;
            res ^= nums[i];
        }
        return res;
    }

    // using sum difference to get missing number
    public int missingNumberSolution2(int[] nums) {
        int sumArray = 0;
        int sumLength = 0;
        for (int i = 0; i < nums.length; i++) {
            sumArray += nums[i];
            sumLength += i;
        }
        return sumLength + nums.length - sumArray;
    }
}
