/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        int count = 10000;
        ListNode node = head;
        while(node != null){
            if(count < 0) return true;
            node = node.next;
            count--;
        }
        return count < 0;
    }
}