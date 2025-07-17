class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        int start=0;
        for(int i=n-1;i>=0;i--){
            char ch=num.charAt(i);
            if((ch-'0')%2==1){
               return num.substring(start,i+1);
            }
        }
        return "";
    }
}