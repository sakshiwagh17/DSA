public class LinkedListImplementation {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class LLStack {
        Node head = null;
        int size = 0;
        //To push int the stack
        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        // to pop from the stack
        int pop() {
            if (head == null)
                return -1;
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        // To get the top of the stack
        int peek() {
            if (head == null)
                return -1;
            return head.val;
        }

        // To check the statck is empty or not
        boolean isEmpty() {
            if (size == 0) {
                return true;
            }
            return false;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int getsize() {
            return size;
        }
    }

    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(30);
        st.push(19);
        st.push(90);
        st.push(23);
        st.display(); // 30 19 90 23
        st.pop();
        st.display(); // 30 19 90
        System.out.println(st.getsize()); // 3
        System.out.println(st.isEmpty());
    }
}
