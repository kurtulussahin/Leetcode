class Solution {
    public int strStr(String haystack, String needle) {

        for(int i=0; i<haystack.length(); i++){
            for(int j=0; j<needle.length(); j++){
                if(i+j >=haystack.length() ){
                    return -1;
                }
                if(needle.charAt(j)!=haystack.charAt(i+j)){
                    break;
                }

                if(j==needle.length()-1){
                    return i;
                }
            }
        }

        return -1;
        
    }
}