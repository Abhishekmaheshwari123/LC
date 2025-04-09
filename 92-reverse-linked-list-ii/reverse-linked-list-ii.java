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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        if(left == 1 && right != len){
            ListNode b = head;
            ListNode c = head;
            int index = 1;
            while(index != right){
                c = c.next;
                index++;
            }
            ListNode d = c.next;
            c.next = null;
            c = reverse(b);
            b.next = d;
            return c;

        }
        else if(right == len && left != 1){
                ListNode a = head;
                int index = 1;
                while(index+1 != left){
                    a = a.next;
                    index++;
                }
                ListNode b = a.next;
                a.next = null;
                ListNode c = reverse(b);
                a.next = c;
                return head;
        }
        else if(left == 1 && right == len){
            return reverse(head);
        }
        else {
            ListNode a = head;
            int index = 1;
            while(index+1 != left){
                a = a.next;
                index++;
            }
            ListNode b = a.next;
            a.next = null;
            index = left;
            ListNode c = b;
            while(index != right){
                index++;
                c = c.next;
            }
            ListNode d = c.next;
            c.next = null;
            c = reverse(b);
            a.next = c ; 
            b.next = d;
            return head;

        }
        // return head;
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
}