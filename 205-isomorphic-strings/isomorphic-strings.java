class Solution {
    public boolean isIsomorphic(String s, String t) {
       int n=s.length();
       int m=t.length();
       if(n!=m){
        return false;
       } 
       HashMap<Character, Character> map1=new HashMap<>();
       HashMap<Character, Character> map2 = new HashMap<>();
       for(int i=0;i<n;i++){
        char chS=s.charAt(i);
        char chT=t.charAt(i);

        if(map1.containsKey(chS)){
            if(map1.get(chS)!=chT){
                return false;
            }
        }
        else{
            map1.put(chS,chT);
        }

        if(map2.containsKey(chT)){
            if(map2.get(chT)!=chS){
                return false;
            }
        }
        else{
            map2.put(chT,chS);
        }

       }
       return true;
    }
}