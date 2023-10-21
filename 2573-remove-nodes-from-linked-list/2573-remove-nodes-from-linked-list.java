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
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode tempHead = head; 
        while(tempHead != null){
            stack.push(tempHead);
            tempHead = tempHead.next;
        }
        ListNode sentinel = stack.pop();
        int val = sentinel.val;
        while(stack.size() >0){
            ListNode node = stack.pop();
            if(node.val >= val){
                val = node.val;
                node.next = sentinel;
                sentinel = node;
            }
        }
        return sentinel;
    }
}