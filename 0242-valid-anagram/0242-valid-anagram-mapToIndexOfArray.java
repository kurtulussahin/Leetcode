class Solution {
    public boolean isAnagram(String s, String t) {
        
        int z='z';
        int[] frequency= new int[z+1];

        for(char c : s.toCharArray()){
            frequency[c]++;
        }

         for(char c : t.toCharArray()){
            frequency[c]--;
        }

        for(int val : frequency ){
            if(val != 0){
                return false;
            }
        }

        return true;
        
    }
}