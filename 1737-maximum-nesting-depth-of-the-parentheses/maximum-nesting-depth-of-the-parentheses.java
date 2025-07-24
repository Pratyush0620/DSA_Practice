class Solution {
    public int maxDepth(String s) {
        int currentDepth=0;
        int maxDepth=0;

        for(char c:s.toCharArray()){
            if(c=='('){
                currentDepth++;
                maxDepth=Math.max(currentDepth,maxDepth);
            }
            else if(c==')'){
                currentDepth--;
            }
        }
        return maxDepth;
    }
}