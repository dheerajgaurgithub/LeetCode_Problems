class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        Map<Character,Character> map=new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        for(char c:s.toCharArray()){
            if(map.containsKey(c)){
                char top = stack.isEmpty() ? '#' : stack.pop();
                if (top != map.get(c)) {
                    return false;
                } 
            }
            else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}