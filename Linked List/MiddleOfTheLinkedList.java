/*
 876th problem in leetcode  --  Middle of the Linked List

Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.

Example 1:

Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
 */

 public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
    
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);

    
        MiddleNode solution = new MiddleNode();
        ListNode middle = solution.middleNode(head);

    
        System.out.print("Middle of the linked list: ");
        while (middle != null) {
            System.out.print(middle.val + " ");
            middle = middle.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    
    ListNode() {}
    
    ListNode(int val) { 
        this.val = val; 
    }
    
    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    }
}


class MiddleNode {
    public ListNode middleNode(ListNode head) {
        ListNode th = head;
        int count = 0;
        
        while (th != null) {
            count++;
            th = th.next;
        }
        
        int mid = count / 2;
        
        for (int i = 0; i < mid; i++) {
            head = head.next;
        }
        return head;
    }
}


