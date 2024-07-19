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
        ListNode cur;
        cur =head;
        Stack <Integer> stk = new Stack<>();
        while(cur!=null)
        {
            stk.push(cur.val);
            cur=cur.next;
        }
        cur =head;
        while(cur!=null && cur.val == stk.pop())
        {
            cur=cur.next;
        }
        return cur==null;
        
    }
}