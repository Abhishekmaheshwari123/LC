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
    public ListNode deleteDuplicates(ListNode head) {
     ListNode curr = head;
     ListNode dummy = new ListNode(-1);
     ListNode ans = dummy;
     while(curr != null){
        if(curr.next != null && curr.val == curr.next.val){
            while(curr.next != null && curr.val == curr.next.val)curr = curr.next;
            curr = curr.next;
        }
        else{
            System.out.println(curr.val);
            dummy.next = curr;
            dummy = dummy.next;
            curr = curr.next;
        }
     }
     dummy.next = null;
     return ans.next;
    }
}