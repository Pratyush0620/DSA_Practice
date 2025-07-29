/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
         ArrayList<Integer> list=new ArrayList<>();
         ListNode curr=head;
         int i=1;
         while(curr!=null){
            if(i%2==1){
                list.add(curr.val);
            }
            curr=curr.next;
            i++;
         }
         i=1;
         curr=head;
         while(curr!=null){
            if(i%2==0){
                list.add(curr.val);
            }
            curr=curr.next;
            i++;
         }
         curr=head;
         i=0;
         while(curr!=null){
            curr.val=list.get(i);
            curr=curr.next;
            i++;
         }
         return head;
         
    }
}