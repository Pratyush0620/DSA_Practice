class Solution {
    public String reverseWords(String s) {
        Stack<String> stack=new Stack<>();
        int n=s.length();
        int start=0;
        StringBuilder result=new StringBuilder();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                if (start < i) {
                    stack.push(s.substring(start, i));
                }
                start = i + 1;
            }
        }
        if (start < n) {
            stack.push(s.substring(start));
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
            if (!stack.isEmpty()) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}