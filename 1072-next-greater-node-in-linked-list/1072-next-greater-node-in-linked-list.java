class Solution {
    public int[] nextLargerNodes(ListNode head) {
    ListNode t = head;
    int p = 1, i = 0 ;
    while(t.next != null) {
        t = t.next;
        p++;
    }   
    int a[] = new int[p];
    ListNode curr = head;
    while(curr != null) {
        t = curr.next;
       int c = 0;
        while(t != null) {
           if(t.val > curr.val) {
               a[i] = t.val;
               i++;
               c = 1;
               break;
           }
            t = t.next;
        }
        if(c == 0) {
            a[i] = 0;
            i++;
        }
        curr = curr.next;
    }
    return a;
    }
}