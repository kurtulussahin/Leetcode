class Solution {
    public int missingNumber(int[] nums) {
        int res = nums.length;

        int total =0;
        int expected=0;
        for(int i=0; i<nums.length; i++){
            total+=nums[i];
            expected+=i;
        }

        expected+=nums.length;



        return expected-total;
    }
}