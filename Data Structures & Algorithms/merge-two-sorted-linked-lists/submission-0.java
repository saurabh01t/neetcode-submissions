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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode currList1 = list1;
        ListNode currList2 = list2;
        ListNode dummyHead = new ListNode(-1, null);
        ListNode tail = dummyHead;
        while(currList1 != null && currList2 != null) {
            if(currList1.val <= currList2.val) {
                tail.next = currList1;
                currList1 = currList1.next;
            }else {
                tail.next = currList2;
                currList2 = currList2.next;
            }
            tail = tail.next;
        }
        if(currList1 != null){
            tail.next = currList1;
        } else {
            tail.next = currList2;
        }
       
      return dummyHead.next;  
    }
}