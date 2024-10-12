class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[]=new int[2];
        Map<Integer, Integer> complementMap = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            complementMap.put(nums[i], i);
        }

        for(int i=0; i<nums.length; i++){
            int complement=target-nums[i];
            if(complementMap.containsKey(complement) && complementMap.get(complement) !=i){
                result[0]=i;
                result[1]=complementMap.get(complement);
                return result;
            }
        }

        return result;

    }
}