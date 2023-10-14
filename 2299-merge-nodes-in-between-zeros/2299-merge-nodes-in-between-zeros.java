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
    public ListNode mergeNodes(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode resHead = new ListNode();
        ListNode current = resHead, temp = head.next;
        int sum = 0;

        while(temp != null){
            sum+=temp.val;
            if(temp.val == 0){
                ListNode node = new ListNode(sum);
                current.next = node;
                current = current.next;
                sum = 0;
            }
            temp = temp.next;
        }

        return resHead.next;
    }
}