class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int result[] =new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        for(int key : map.keySet()){
            System.out.println(key);
            System.out.println(map.get(key));
            }
        
        for(int i=0; i<k; i++){
            int max=0;
            int keyMax=0;
            for(int key : map.keySet()){
                if(map.get(key)>max){
                    max=map.get(key);
                    keyMax=key;
                }

            }
            result[i]=keyMax;
            map.remove(keyMax); 
        }

        return result;
    }
}