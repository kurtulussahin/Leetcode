class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for(int i= 0; i<nums.length; i++){
            int complement =target-nums[i];
            if(map.containsKey(complement) && i!=map.get(complement)){
                result[0]=map.get(target-nums[i]);
                result[1]=i;
                return result;

            }
            map.put(nums[i], i);
        }

        return result;
        
    }
}