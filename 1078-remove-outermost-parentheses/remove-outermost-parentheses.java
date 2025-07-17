class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result=new StringBuilder();
        int balance=0;
        int start=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='('){
                balance++;
            }else{
                balance--;
            }
            if(balance==0){
                result=result.append(s.substring(start+1,i));
                start=i+1;
            }
        }
        return result.toString();
    }
}