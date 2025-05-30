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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        while(temp.next != null){
            int x = temp.val;
            ListNode front = temp.next;
            int z = find(x,front.val);
            ListNode bet = new ListNode(z);
            temp.next = null;
            temp.next = bet;
            bet.next = front;
            temp = temp.next.next;
        }
        return head;
    }
    int find(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); 
    }
}