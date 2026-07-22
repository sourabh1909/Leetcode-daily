public class Reverse{

    static class Node{
        int data;
        Node next;

        public Node(int data,Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void ans(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast != null){
            slow = slow.next;
        }
        
        Node prev = null;
        Node curr = head;
        while(head != null){
            curr = head.next;
            head.next = prev;
            prev = head;
            head = curr;
        }

    }

    public static void main(String[] args) {
        
    }
    
}