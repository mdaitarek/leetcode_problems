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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] arrayList = new ListNode[k];

        int n = 0;
        ListNode tempHead = head;
        while(tempHead != null){
            tempHead = tempHead.next;
            n++;
        }

        for(int i=0; i<k; i++){ 
            if(head != null){   
                int len = n%(k-i) == 0 ? n/(k-i) : n/(k-i) + 1;
                n-=len;

                arrayList[i] = head;
                
                ListNode tail = null;
                for(int j=0; j<len; j++){
                    tail = head;
                    head = head.next;
                }
                tail.next = null;
            }
        }


        return arrayList;
    }
}