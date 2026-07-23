import java.util.ArrayList;

//class Solution {
//    public StringBuilder sum(int[] l1, int[] l2) {
//        StringBuilder num1 = new StringBuilder();
//        StringBuilder num2 = new StringBuilder();
//        for (int i = 0; i < l1.length; i++){
//            num1.append(l1[i]);
//        }for (int j = 0; j < l2.length; j++){
//            num2.append(l2[j]);
//        }
//        StringBuilder res = new StringBuilder(String.valueOf(Integer.parseInt(num1.toString()) + Integer.parseInt(num2.toString())));
//        return res.reverse();
//    }
//
//    //для проверки
//    public static void main(String[] args) {
//        int[] l1 = {9,9,9,9,9,9,9};
//        int[] l2 = {9,9,9,9};
//
//        Solution sol = new Solution();
//        StringBuilder res = sol.sum(l1, l2);
//        System.out.println(res);
//    }
//}

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
        }
        return dummy.next;
    }
}