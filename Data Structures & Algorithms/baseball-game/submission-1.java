class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i =0; i < operations.length; i++) {
            if(isIntegerNative(operations[i])){
                stack.push(Integer.parseInt(operations[i]));
            }else {
                if("+".equals(operations[i])){
                    if(stack.size() >= 2){
                        int firstTop = stack.pop();
                        int secondTop = stack.pop();
                        stack.push(secondTop);
                        stack.push(firstTop);
                       stack.push(firstTop + secondTop);
                    } else{
                        stack.push(stack.peek());
                    }
                }else if("D".equals(operations[i])){
                    if(stack.size() >= 1){
                       stack.push(2 * stack.peek());
                    }
            }else {
                    stack.pop();
                }
        }
    }
    int sum = 0;
    while(stack.size() > 0) {
        sum += stack.pop();
    }
    return sum;
    }
     private static boolean isIntegerNative(String str) {
    if (str == null) return false;
    try {
        Integer.parseInt(str);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}
}