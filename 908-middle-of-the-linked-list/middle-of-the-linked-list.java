class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null)
        {
            fast = fast.next;
            if(fast!=null)
            {
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow;
        
    }
}