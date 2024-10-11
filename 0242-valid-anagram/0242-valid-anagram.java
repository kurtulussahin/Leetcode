class Solution {
    public boolean isAnagram(String s, String t) {

        Map<Character, Integer> frequencyOfChars = new HashMap<>();

        // Push frequency of characters to map
        for (char c : s.toCharArray()) {
            frequencyOfChars.put(c, frequencyOfChars.getOrDefault(c, 0) + 1);
        }

        // Pop frequency of characters from map
        for (char c : t.toCharArray()) {
            frequencyOfChars.put(c, frequencyOfChars.getOrDefault(c, 0) - 1);
        }

        for (int val : frequencyOfChars.values()) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }
}