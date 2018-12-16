/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    ListNode dummy = new ListNode(0);
    ListNode curr=dummy;
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        helper(l1,l2);
        return dummy.next;
    }
    public void helper(ListNode l1, ListNode l2){
        if(l1==null && l2==null) return;
        if(l1==null || l2==null){
            if(l1!=null) curr.next= l1;               
            if(l2!=null)curr.next= l2;
            return;
        }
        if(l1.val<=l2.val){
            curr.next=l1;
            curr=curr.next;
            helper(l1.next,l2);
        }
        if(l2.val<l1.val){
            curr.next=l2;
            curr=curr.next;
            helper(l1,l2.next);
        }
    }
}
