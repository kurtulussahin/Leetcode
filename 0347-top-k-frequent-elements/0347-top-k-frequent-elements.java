class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length+1];
        Map<Integer, Integer> map= new HashMap<>();


        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        for(int key:map.keySet()){
            int freq = map.get(key);
            if(bucket[freq]==null){
                bucket[freq]=new LinkedList<>();
            }
            bucket[freq].add(key);
        }

        int[] result= new int[k];
        int pos=0;

        for(int i =bucket.length-1; i>=0; i--){
            if(bucket[i]!=null){
                for(int j=0; j<bucket[i].size() && pos<k; j++){
                    result[pos]=bucket[i].get(j);
                    pos++;
                }
              
            }
        }

        return result;
    }
}