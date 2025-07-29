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
    public boolean isPalindrome(ListNode head) {
        // Stack<Integer> stack=new Stack<>();
        // ListNode curr=head;
        // while(curr!=null){
        //     stack.push(curr.val);
        //     curr=curr.next;                  //using Stack
        // }
        // curr=head;
        // while(curr!=null){
        //     if(curr.val!=stack.pop()){
        //         return false;
        //     }
        //     curr=curr.next;
        // }
        // return true;
        // Step 1: Create a reversed copy of the list
        ListNode reversed = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode newNode = new ListNode(curr.val); // Create a new node
            newNode.next = reversed;
            reversed = newNode;
            curr = curr.next;
        }

        // Step 2: Compare original and reversed lists
        ListNode p1 = head;
        ListNode p2 = reversed;

        while (p1 != null && p2 != null) {
            if (p1.val != p2.val) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }
}