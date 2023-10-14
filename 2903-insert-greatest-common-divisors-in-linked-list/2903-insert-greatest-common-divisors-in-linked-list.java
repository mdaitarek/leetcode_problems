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
    public int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode currNode = head;

        if(currNode.next == null) return currNode;

        while(currNode.next != null){
            ListNode nextNode = currNode.next;
            int gcd = gcd(currNode.val, nextNode.val);
            ListNode node = new ListNode(gcd);
            node.next = currNode.next;
            currNode.next = node;
            currNode = nextNode;
        }

        return head;

    }
}