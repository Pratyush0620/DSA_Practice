class Solution {
    public String reverseWords(String s) {
        
        Stack<String> stack=new Stack<>();
        StringBuilder str=new StringBuilder();
        s=s.trim();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                str.append(ch);
            }else if(str.length() > 0){
                stack.push(str.toString());
                str.setLength(0);
            }
        }
        if(str.length() > 0){
            stack.push(str.toString());
        }
        str.setLength(0);
        while(!stack.isEmpty()){
            str.append(stack.pop());
            if(!stack.isEmpty()) str.append(" ");
            
        }
        return str.toString();

    }
}