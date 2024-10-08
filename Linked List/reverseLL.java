
// Definition for singly-linked list.

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class reverseLL{

    public static void main(String[] args){

        ListNode node1 = new ListNode(10);
        ListNode node2 = new ListNode(20, node1);
        ListNode node3 = new ListNode(30, node2);
        ListNode node4 = new ListNode(40, node3);
        ListNode node5 = new ListNode(50, node4);
        
        ListNode head = node5;

        System.out.println("Original Linked List: ");
        display(head);

        head = reverse(head);

        System.out.println();
        System.out.println("After iterative reversing: ");
        display(head);

        head = reverseRecursion(head);

        System.out.println();
        System.out.println("After recursive reversing: ");
        display(head);
        

    }

    private static void display(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val);
            temp = temp.next;
            if(temp != null)
                System.out.print(" -> ");
        }
    }

    private static ListNode reverse(ListNode head){
        ListNode temp = null;

        if(head == null || head.next == null){return head;}
        
        else{

            while(head != null){

                ListNode nextNode = head.next;
                head.next = temp;
                temp = head;
                head = nextNode;
            }

        }

        return temp;
    }


    private static ListNode reverseRecursion(ListNode head){
        // Base case:
        // If the linked list is empty or has only one node,
        // return the head as it is already reversed.
        if (head == null || head.next == null) {
            return head;
        }
        
        // Recursive step:
        // Reverse the linked list starting
        // from the second node (head.next).
        ListNode newHead = reverseRecursion(head.next);
        
        // Save a reference to the node following
        // the current 'head' node.
        ListNode front = head.next;
        
        // Make the 'front' node point to the current
        // 'head' node in the reversed order.
        front.next = head;
        
        // Break the link from the current 'head' node
        // to the 'front' node to avoid cycles.
        head.next = null;
        
        // Return the 'newHead,' which is the new
        // head of the reversed linked list.
        return newHead;
    }
    
}

