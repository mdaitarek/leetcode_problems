/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var deleteDuplicates = function(head) {
    if(head === null) return head;
    let node = head;
    let current = head;
    while(current !== null && node !== null){
        if(node.val !== current.val){
            node.next = current;
            node = current;
        }
        current = current.next;
    }
    node.next=null;
    return head;
};