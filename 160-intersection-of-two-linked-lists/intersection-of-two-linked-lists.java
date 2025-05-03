/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int c = 0;
        ListNode t = headA;
        ListNode s = headB;
        while(c != 4){
            if(t == s)return t;
            if(t != null)t = t.next;
            else {
                t = headB;
                c++;
            }
            if(s != null) s = s.next;
            else {
                s = headA;
                c++;
            }


        }
        return null;
    }
}