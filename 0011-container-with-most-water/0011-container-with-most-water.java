class Solution {
    public int maxArea(int[] height) {

        int result=0;

        int left=0;
        int right = height.length-1;

        while(left<right){
            if(Math.min(height[left], height[right])*(right-left)> result){
                result=Math.min(height[left], height[right])*(right-left);
            }else {
                if(height[right]<height[left]){
                    right--;
                }else{
                    left++;
                }
            }
        }

        return result;
        
    }
}