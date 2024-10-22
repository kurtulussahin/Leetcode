class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder ans = new StringBuilder();

        String first = strs[0];
        String last = strs[strs.length-1];

        int shortOneLength = Math.min(first.length(), last.length());
        
        for(int i=0; i<shortOneLength; i++ ){
            if(first.charAt(i)!= last.charAt(i)){
                return ans.toString();
            }

            ans.append(first.charAt(i));
        }
        
        return ans.toString();
    }
}