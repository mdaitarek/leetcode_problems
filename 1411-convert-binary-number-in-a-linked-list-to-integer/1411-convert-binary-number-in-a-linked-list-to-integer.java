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
    public int getDecimalValue(ListNode head) {
        int count = 0;
        ListNode node = head;
        while(node != null){
            count++;
            node = node.next;
        }
        int decimal = 0;
        while(head != null){
            decimal += (head.val * Math.pow(2, --count));
            head = head.next;
        }

        return decimal;
    }
}