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
    public ListNode removeNodes(ListNode head) {
        if(head==null){
            return null;
        }
/* initialize variable max assign 0 to it
      then we revarse the list and compare if node.val>max the remove thr node from list,finaly revarse again then retunn;*/

        ListNode prev=null;
        ListNode curr=head;
        int max=0;
        while(curr!=null){
            ListNode ans=curr.next;
            curr.next=prev;
            prev=curr;
            curr=ans;
        }
        head=prev;
        ListNode p=null;
        while(prev.next!=null){
            if(prev.val>=max){
             max=prev.val;
             p=prev;
             prev=prev.next;
            }
            else{
                p.next=prev.next;
                prev=prev.next;

            }

        }
        if(prev.val<max){
            p.next=null;
        }
        prev=null;
        curr=head;
        while(curr!=null){
            ListNode ans=curr.next;
            curr.next=prev;
            prev=curr;
            curr=ans;
        }
        head=prev;

       return head; 
    }
}