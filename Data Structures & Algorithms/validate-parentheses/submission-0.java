class Solution {
    public boolean isValid(String s) {
        if(null == s && s.length() % 2 != 0 && s.isEmpty()){
            return false;
        }
        char[] chArr = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < chArr.length; i++) {
            char currBracket = chArr[i];

            if(currBracket == '(') {
                stack.push(')');
            }else if(currBracket == '{') {
                stack.push('}');
            }else if(currBracket == '[') {
                stack.push(']');
            } else{
                if(stack.isEmpty() || currBracket !=stack.pop()) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
}
}
