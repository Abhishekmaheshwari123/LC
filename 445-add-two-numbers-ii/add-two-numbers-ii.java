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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l = reverse(l1);
        ListNode r = reverse(l2);
        ListNode ans =  add(l,r);
         return reverse(ans);
    }
    ListNode reverse(ListNode node){
        ListNode prev = null;
        while(node != null){
            ListNode front = node.next;
            node.next = prev;
            prev = node;
            node = front;
        }
        return prev;
    }
    ListNode add(ListNode l, ListNode r){
        ListNode head = new ListNode();
        ListNode temp = head;
        boolean carry = false;
        while(l != null || r != null){
            int val = 0;
            if(carry)val++;
            if(l != null){
                val += l.val;
                l = l.next;
            }
            if(r != null){
                val += r.val;
                r = r.next;
            }
            if(val > 9)carry = true;
            else carry = false;
            ListNode nn = new ListNode(val % 10);
            temp.next = nn;
            temp = temp.next;
        }
        if(carry){
            ListNode nn = new ListNode(1);
            temp.next = nn;
        }
        return head.next;
    }
}