class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int i =0;
        char[] arr = {'[', '{', '('};
        while(i < s.length() && !stack.isEmpty()){
            char ch = s.charAt(i);
            if(ch == '[' || ch == '{' || ch == '('){
                stack.push(ch);
            } else {
                char x = stack.pop();
                if(!((ch == ']' && x == arr[0]) || 
                    (ch == '}' && x == arr[1]) || 
                    (ch == ')' && x == arr[2])))
                    return false;
            }
            i++;
        }

        return stack.isEmpty();
    }
}
