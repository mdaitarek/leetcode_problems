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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode dummy = new ListNode();
        dummy.next = list1;

        ListNode list1Pre = dummy;
        for(int i=0; i<a; i++){
            list1Pre = list1Pre.next;
            list1 = list1.next;
        }
        list1Pre.next = list2;

        for(int i=0; i<b-a+1; i++){
            list1 = list1.next;
        }
        ListNode list1Post = list1;

        while(list2.next != null){
            list2 = list2.next;
        }
        list2.next = list1Post;

        return dummy.next;
    }
}