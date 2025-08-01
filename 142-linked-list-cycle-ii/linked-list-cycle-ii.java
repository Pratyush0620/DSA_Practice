/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // HashMap<ListNode,Integer> map=new HashMap<>();
        // ListNode curr=head;
        // while(curr!=null){
        //     if(map.containsKey(curr)){
        //         return curr;                    ///Using HashMap
        //     }
        //     map.put(curr,1);
        //     curr=curr.next;
        // }
        // return null;

        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(fast==slow){
                slow=head;

                while(slow!=fast){
                    fast=fast.next;
                    slow=slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}