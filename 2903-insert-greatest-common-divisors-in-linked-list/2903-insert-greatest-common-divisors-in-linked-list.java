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
    public int gcd(int n1, int n2){
        while(n1!=n2){
            if(n1 > n2)
                n1 -= n2;
            else
                n2 -= n1;
        }

        return n1;
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