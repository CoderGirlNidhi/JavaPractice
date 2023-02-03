package com.nj.leetcode;

// https://leetcode.com/problems/remove-duplicates-from-sorted-list
public class LLRemoveDuplicate {
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicated(ListNode head) {
        //input validation
        if(head == null) {
            return null;
        }

        ListNode i = head , currentNode = head.next;

        while(currentNode != null) {

            if(i.val != currentNode.val) {
                i.next = currentNode;
                i = i.next;
            }
            currentNode = currentNode.next;
        }

        i.next = null;
        return head;
    }
}
 class ListNode {
     int val;
     ListNode next;

     ListNode() {
     }

     ListNode(int val) {
         this.val = val;
     }

     ListNode(int val, ListNode next) {
         this.val = val;
         this.next = next;
     }
 }


