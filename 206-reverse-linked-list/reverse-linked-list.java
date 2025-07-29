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
    public ListNode reverseList(ListNode head) {
        // Stack<Integer> stack=new Stack<>();
        // ListNode curr=head;
        // while(curr!=null){
        //     stack.push(curr.val);
        //     curr=curr.next;
        // }                                       //iterative approach and more space 
        // curr=head;
        // while(curr!=null){
        //     curr.val=stack.pop();
        //     curr=curr.next;
        // }
        // return head;

        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}