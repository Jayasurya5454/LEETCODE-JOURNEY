
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode temp=head;
        int c=0;
        while(temp!=null)
        {
            temp=temp.next;
            c++;
        }
        c = c-n;
        temp=head;
        int t=0;
        if(c==0)return head.next;
        while(temp!=null)
        { 
            if(t==c-1)
            {
                temp.next=temp.next.next;
                break;
                

            }
        
                temp=temp.next;
                t++;

        }
        return head;
        
    }
}