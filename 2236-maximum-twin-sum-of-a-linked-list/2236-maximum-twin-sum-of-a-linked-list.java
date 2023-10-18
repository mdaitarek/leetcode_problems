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
    public int pairSum(ListNode head) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ListNode tempHead = head;
        int n = 0, max = 0;
        while(tempHead != null){
            list.add(tempHead.val);
            n++;
            tempHead = tempHead.next;
        }
        for(int i=0; i<n/2; i++){
            max = Math.max(max, (head.val + list.get(n-1-i)));
            head = head.next;
        }

        return max;
    }
}