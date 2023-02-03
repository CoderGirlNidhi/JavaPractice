package com.nj.leetcode;

public class MergeSortedList {

    public ListNode1 mergeTwoLists(ListNode1 j, ListNode1 k) {
        // input validation
        if (j == null && k == null) {
            return null;
        }

        ListNode1 list3;

        // First node assignments.
        if (j == null) {
            list3 = k;
            k = k.next;
        } else if (k == null) {
            list3 = j;
            j = j.next;
        } else {
            if (j.val < k.val) {
                list3 = j;
                j = j.next;
            } else {
                list3 = k;
                k = k.next;
            }
        }

        // Saving reference to first node in head.
        ListNode1 head = list3;

        while(true) {
            if (j == null) {
                list3.next = k;
                break;
            }
            if (k == null) {
                list3.next = j;
                break;
            }

            if (j.val > k.val) {
                list3.next = k;
                list3 = list3.next;
                k = k.next;
            } else {
                list3.next = j;
                list3 = list3.next;
                j = j.next;
            }
        }

        // returning first node "head" of result list.
        return head;
    }
}

 class ListNode1 {
      int val;
      ListNode1 next;
      ListNode1 () {}
      ListNode1 (int val) {
       this.val = val;
      }
      ListNode1(int val, ListNode1 next) {
          this.val = val; this.next = next;
      }
}
