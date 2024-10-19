class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int topRowPointer=0;
        int bottomRowPointer=matrix.length-1;

        while(topRowPointer<bottomRowPointer){
            int mid=(bottomRowPointer+ topRowPointer)/2;

            if(matrix[mid][0]<=target && matrix[mid][matrix[mid].length-1]>=target){
                break;
            }else if (matrix[mid][0]>target){
                bottomRowPointer =mid-1;
            }else {
                topRowPointer =mid+1;
            }
                
        }

        int row=(topRowPointer+bottomRowPointer)/2;

        int leftPointer=0;
        int rightPointer=matrix[row].length-1;

        while (leftPointer <= rightPointer){

            int mid = (leftPointer+rightPointer)/2;
            System.out.println(row);
            System.out.println(leftPointer);
            System.out.println(rightPointer);
            if(matrix[row][mid]==target){
                return true;
            }else if (matrix[row][mid]>target){
                rightPointer=mid-1;
            }else {
                leftPointer=mid+1;
            }

        }
        return false;
        
    }
}