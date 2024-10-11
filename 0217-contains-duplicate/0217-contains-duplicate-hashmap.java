class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> frequencyOfNums = new HashMap<>();
        for(int num : nums){
            if(frequencyOfNums.containsKey(num) && frequencyOfNums.get(num)>=1 ){
                return true;
            }
            frequencyOfNums.put(num, frequencyOfNums.getOrDefault(num, 0)+1);
        }
        return false;
    }
}