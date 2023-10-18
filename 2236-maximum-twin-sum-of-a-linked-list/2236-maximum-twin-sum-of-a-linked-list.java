class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int count = 0;
        //get middle element and calculate the size upto middle
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            count++;
        }
        //Create an array of size count
        int arr[] = new int[count];
        //initailize a pointer i = 0 which points to the first element in the array
        int i = 0;
        int max = Integer.MIN_VALUE;
        while(count != 0){
            arr[i] += head.val;
            arr[count-1] += slow.val;
            head = head.next;
            slow = slow.next;
            max = Math.max(max,arr[i]);
            max = Math.max(max,arr[count-1]);
            i++;
            count--;
        }
        return max;
    }
}