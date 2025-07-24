 class Solution {
    public boolean isAnagram(String s, String t) {
        // int n=s.length();
        // int m=t.length();
        // if(n!=m){
        //     return false;
        // }
        // HashMap<Character,Integer> map1=new HashMap<>();
        // HashMap<Character,Integer> map2=new HashMap<>();
        // for(int i=0;i<n;i++){
        //     char ch_1=s.charAt(i);
        //     char ch_2=t.charAt(i);

        //     if(map1.containsKey(ch_1)){
        //         map1.put(ch_1,map1.getOrDefault(ch_1,0)+1);
        //     }else{
        //         map1.put(ch_1,1);
        //     }

        //     if(map2.containsKey(ch_2)){
        //         map2.put(ch_2,map2.getOrDefault(ch_2,0)+1);
        //     }else{
        //         map2.put(ch_2,1);
        //     }
            
        // }
        // for(int i=0;i<n;i++){
        //     char ch_1=s.charAt(i);
        //     if(!map2.containsKey(ch_1)) return false;
        //     if(map1.get(ch_1) != map2.get(ch_1)){
        //         return false;
        //     }
        // }
        // return true;
       
        // if (s.length() != t.length()) return false;

        // HashMap<Character, Integer> map1 = new HashMap<>();
        // HashMap<Character, Integer> map2 = new HashMap<>();

        // for (int i = 0; i < s.length(); i++) {
        //     char ch1 = s.charAt(i);
        //     char ch2 = t.charAt(i);

        //     map1.put(ch1, map1.getOrDefault(ch1, 0) + 1);
        //     map2.put(ch2, map2.getOrDefault(ch2, 0) + 1);
        // }

        // return map1.equals(map2);
        if (s.length() != t.length()) return false;
        char[] ch1=s.toCharArray();
        char[] ch2=t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);

    }
}

    
