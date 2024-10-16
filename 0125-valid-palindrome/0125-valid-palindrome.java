class Solution {

    public boolean isAlfanumeric(char c) {
        if ((c >= 'a' && c <= 'z') ||
                (c >= 'A' && c <= 'Z') ||
                (c >= '0' && c <= '9')

        ) {
            return true;
        }
        return false;
    }

    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }

        s = s.toLowerCase();

        int leftPointer = 0;
        int rightPointer = s.length() - 1;

        while (leftPointer < rightPointer) {
            while (leftPointer < rightPointer && !isAlfanumeric(s.charAt(leftPointer))) {
                leftPointer++;
            }
            while (leftPointer < rightPointer && !isAlfanumeric(s.charAt(rightPointer))) {
                rightPointer--;
            }

            if (s.charAt(leftPointer) != s.charAt(rightPointer)) {
                return false;
            }

            leftPointer++;
            rightPointer--;
        }

        return true;

    }
}