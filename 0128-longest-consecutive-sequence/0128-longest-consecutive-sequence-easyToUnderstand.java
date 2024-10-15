class Solution {
    public int longestConsecutive(int[] nums) {

        int max=0;

        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        for(int i=0; i<nums.length; i++){
            int count=0;

            int num = nums[i];
            if (!set.contains((num-1))){
                // look right.
                while (set.contains(num++)){
                    count++; 
                }
            }

            max= Math.max(max, count);

        }
        
        return max;
    }
}