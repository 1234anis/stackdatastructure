/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
         ListNode cur = head;
        while(cur != null) {            
            ListNode start = head;
            
            // move to the position in the sorted part
            while(start.val <  cur.val && start != cur)
                start = start.next;
            
            while(start != cur.next) {
                //swap value with current element
                int tmp = start.val;
                start.val = cur.val;
                cur.val = tmp;
                
                start = start.next;
            }            
            cur = cur.next;            
        }        
        return head;        
    }
}
