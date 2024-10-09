// Defining a class for Stack operations
class Stack{

    int[] stack = new int[5];  // Array to hold stack elements, with size 5
    int top = -1;              // 'top' keeps track of the top element's index, initially set to -1 (empty stack)
    int n = stack.length;      // 'n' holds the maximum size of the stack

    // Method to check if the stack is full
    public boolean isFull(){
        return (top == n-1);   // If 'top' equals last index, stack is full
    }

    // Method to check if the stack is empty
    public boolean isEmpty(){
        return (top == -1);    // If 'top' is still -1, stack is empty
    }

    // Method to add an element to the stack
    public void push(int data) {
        if(!isFull()){         // If stack is not full, proceed to push
            top++;             // Increment 'top' to point to the new top position
            stack[top] = data; // Place the new element at the top
        }
        else
            System.out.println("Stack is Full!");  // If stack is full, display a message
    }

    // Method to remove the top element from the stack
    public int pop(){
        if(!isEmpty()) {       // If stack is not empty, proceed to pop
            int data = stack[top]; // Get the top element
            stack[top] = 0;    // Set the current top to 0 (optional, for visualization)
            top--;             // Decrease 'top' to remove the element
            return data;       // Return the popped element
        } else {
            System.out.println("Stack is Empty!"); // If stack is empty, display a message
            return -1;         // Return an invalid value (error state)
        }
    }

    // Method to view the top element without removing it
    public int peek(){
        if(!isEmpty()){        // If stack is not empty, return top element
            return stack[top];
        } else {
            System.out.println("Stack is Empty!"); // If stack is empty, display a message
            return -1;
        }
    }

    // Method to display the stack elements
    public void show(){
        if(!isEmpty()){        // If stack is not empty, print the elements
            System.out.println("Stack: ");
            for(int i: stack) {
                System.out.print(i + " ");            
            }
            System.out.println();
        }
        else
            System.out.println("Stack is Empty!"); // If stack is empty, display a message
    }
}


// Main class to test the stack implementation
public class stackImplementation{

    public static void main(String[] args) {

        Stack s = new Stack();   // Create a new stack object

        // Push elements onto the stack
        s.push(8);  
        s.push(5);  
        s.push(1);  

        s.show();  // Display the current stack

        // Pop the top element
        int data = s.pop();
        System.out.println("Popped element: " + data);  // Display the popped element
        s.show();  // Display the stack after popping

        // Push more elements
        s.push(77);
        s.push(18);

        // Peek the top element
        int p = s.peek();
        System.out.println("Top element: " + p);  // Display the top element

        // Push another element
        s.push(9);

        s.show();  // Display the current stack

        // Attempt to push an element onto the full stack
        s.push(11);  // Since the stack can hold only 5 elements, this will show "Stack is Full"
        
    }

}


// Stack and Its Features:

// Stack: A stack is a data structure that follows the LIFO (Last In, First Out) principle, meaning the last element added is the first one to be removed.
// Push Operation: Adding an element to the top of the stack.
// Pop Operation: Removing the top element from the stack.
// Peek Operation: Viewing the top element without removing it.
// Is Full/Is Empty: A stack can be checked whether it is full or empty. If full, you cannot push more elements; if empty, there is nothing to pop.