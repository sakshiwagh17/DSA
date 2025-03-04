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
            return head==null;
        }
        void displayRec(Node h){
            if(h==null) return ;
            displayRec(h.next);
            System.out.print(h.val+" ");
        }
        // to display the stack
        void display(){
            displayRec(head);
            System.out.println();
        }
        // To print the stack in reverse order
        void displayRev() {
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
        System.out.println(st.isEmpty()); //false
    }
}
