class Solution {
    public int climbStairs(int n) {
        int lastStairNumberOfWays = 1;
        int previousStairNumberOfWays = 1;

        for(int i=n-1; i>=1; i-- ){
            int temp= previousStairNumberOfWays;
            previousStairNumberOfWays = previousStairNumberOfWays + lastStairNumberOfWays;
            lastStairNumberOfWays=temp;
        }

        return previousStairNumberOfWays;

        
    }
}