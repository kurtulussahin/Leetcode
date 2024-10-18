class Solution {
    public int removeDuplicates(int[] nums) {
        int nthUniqueNumberIndex=1;

        for (int i=1; i<nums.length; i++){
            if(nums[i]!=nums[i-1]){
                nums[nthUniqueNumberIndex]=nums[i];
                nthUniqueNumberIndex++;
            }

        }

        return nthUniqueNumberIndex;
    }
}