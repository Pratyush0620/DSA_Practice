class Solution {
    public String frequencySort(String s) {

        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        PriorityQueue<Map.Entry<Character,Integer>> maxHeap=
                                    new PriorityQueue<>((a,b)->b.getValue()-a.getValue());

        maxHeap.addAll(map.entrySet());

        StringBuilder str=new StringBuilder();
        while(!maxHeap.isEmpty()){
            Map.Entry<Character,Integer> entry=maxHeap.poll();
            char ch=entry.getKey();
            int count=entry.getValue();
            for(int i=0;i<count;i++){
                str.append(ch);
            }
        }
        return str.toString();
    }
}