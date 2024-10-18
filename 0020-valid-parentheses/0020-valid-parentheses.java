class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> characterMap = new HashMap<>();
        characterMap.put(')', '(');
        characterMap.put('}', '{');
        characterMap.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (characterMap.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek().equals(characterMap.get(c))) {
                    stack.pop();
                } else {
                    return false;
                }
               
            }else {
                 stack.push(c);
            }

            
        }
        return stack.isEmpty();
    }
}