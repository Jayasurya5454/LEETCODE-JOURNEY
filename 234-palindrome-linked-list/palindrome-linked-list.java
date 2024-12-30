
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        int c=0;
        while(fast!=null)
        {
            fast = fast.next;
            c++;
            if(fast!=null)
            {
                fast = fast.next;
                c++;
                slow = slow.next;
            }
        }
        if(c%2!=0)slow=slow.next;
        ListNode prev = null;
        while (slow != null) {
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        while(prev!=null)
        {
            if(prev.val!=head.val)
            return false;
            prev=prev.next;head=head.next;
           
        }
        return true;
        
        
    }
}