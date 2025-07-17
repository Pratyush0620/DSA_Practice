class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()==goal.length() && (s+s).contains(goal)){  //using simple logic
            return true;
        }
        else{
            return false;
        }
        // String prefix=s;
        // int i=0;
        //  while (!goal.startsWith(prefix)) {
        //     if (i + 1 >= s.length()) {           //using startsWith method
        //         return false;
        //     }
        //     prefix = s.substring(i + 1) + s.substring(0, i + 1);
        //     i = i + 1;
        // }
        // return prefix.equals(goal);
    }
}