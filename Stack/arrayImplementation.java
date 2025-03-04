public class arrayImplementation {
    public static class Stack {
        int[] arr = new int[5];
        int idx = 0;
        // To push the element in the stack
        void push(int x) {
            if (isFull()) {
                System.out.println("The stack is full!!");
                return;
            }
            arr[idx] = x;
            idx++;
        }
        //To get the top element
        int peek() {
            if (isEmpty()) {
                System.out.println("The stack is empty!!");
                return -1;
            }
            return arr[idx - 1];
        }
        //To remove the element from the array
        int pop() {
            if (isEmpty()) {
                System.out.println("The Stack is empty!!");
                return -1;
            }
            int top = arr[idx - 1];
            idx--;
            return top;
        }
        //To check the stack is empty or not
        boolean isEmpty() {
            if (idx == 0)
                return true;
            else
                return false;
        }
        //To check the stack is full or not
        boolean isFull() {
            if (idx == arr.length) {
                System.out.println("The Stack is full..");
                return true;
            } else {
                return false;
            }
        }
        //To get the size pf the stack
        int size() {
            return idx;
        }
        //To display the Stack
        void display() {
            if (isEmpty()) {
                System.out.println("Stack is Empty!!");
            }
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(20);
        st.push(34);
        st.push(14);
        st.display();// 20 34 14
        st.push(22);
        st.push(3);
        st.display();// 20 34 14 22 3
        System.out.println(st.isFull()); //true
        System.out.println(st.size()); // 5
        st.pop();
        st.display();// 20 34 14 22
        System.out.println(st.peek()); // 22
        System.out.println(st.isEmpty()); //false
        System.out.println(st.isFull()); //false
    }
}
