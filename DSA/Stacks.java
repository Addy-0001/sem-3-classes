package DSA;

public class Stacks {
    int stk[];
    int top = -1;
    int size;

    Stacks(int size) {
        this.size = size;
        this.stk = new int[size];
    }

    boolean isFull(){
        return (top == stk.length - 1);
    }

    boolean isEmpty(){
        return (top == -1);
    }

    public void push(int data) {
        if(isFull()){
            System.out.println("Stack Overflow");
        }
        else{
            // top++; 
            stk[++top] = data; // When the ++ is in prefix, the value of top is increased first. When in suffix, data is inserted first. 

        }
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack Underflow");
            return -1; 
        }
        int temp = top; 
        top--; 
        return(stk[temp]);
        // or: return stk[top--]; //Returns the value present in "stack[top]" and decreases the value of top; 
    }
}
