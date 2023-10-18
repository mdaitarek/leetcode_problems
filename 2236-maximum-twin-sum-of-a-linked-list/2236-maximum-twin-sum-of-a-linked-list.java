class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int max=0;
        //finding the middle node
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //reverse linkedlist from middle
        ListNode prev=null , next;
        while(slow!=null) {
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        //sum up the nodes and finding the maxValue
        while(prev!=null) {
            max = Math.max(max,(head.val + prev.val));
            prev = prev.next;
            head = head.next;
        }
        return max;
    }
}