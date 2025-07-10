public class BasicLL {
    static Node head;
    int size = 0;

    public static class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
        }

    }

    //insert at begin
    void insertAtBegin(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;

    }

    //insert at end
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    //search at given index
    void search(int k) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == k) {
                System.out.println("Element Found");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Element not found!");
    }

    //insert at the index
    void insertAtidx(int val, int idx) {
        Node newNode = new Node(val);
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;

        }
        temp.next = newNode.next;
        temp = newNode.next;

        size++;
    }

    //find the middle
    void findmiddle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);

    }

    //reverse the list
    Node reverse() {
        Node prev = null;
        Node current = head;
        while (current.next != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;

    }

    //delete from begin
     Node deletefromBegin() {
        if (head == null) {
            System.out.println("List is Empty!");
        }
        head = head.next;

        size--;
        return head;

    }

    //delete from middle
    Node DeleteFromMiddle(int idx) {
        if (head == null) {
            System.out.println("List is Empty!");
        }
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
        return temp;

    }

    //delete from end
    void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is Empty!");
        }
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }

    //Display LL
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("Null");
        System.out.println("\nCount: " + size);

    }

    public static void main(String[] args) {
        BasicLL ll = new BasicLL();

        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.insertAtBegin(1);

        ll.display();
        System.out.println("Midddle number in the linked list ");
        ll.findmiddle();
        System.out.println("Reverse the linked list");
        head = ll.reverse();
        ll.display();
        ll.deletefromBegin();
        ll.display();
        ll.DeleteFromMiddle(3);
        ll.display();
        ll.deleteFromEnd();
        ll.display();

    }
}

