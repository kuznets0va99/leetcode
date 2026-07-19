import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    //для проверки
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 8;
        Solution sol = new Solution();
        int[] res = sol.twoSum(nums,target);
        System.out.println(Arrays.toString(res));
    }
}