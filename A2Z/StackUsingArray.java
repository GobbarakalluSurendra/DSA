import java.util.*;
class StackArray{
    int[] arr;
    int top;
    int capacity;
    StackArray(int size){
        capacity=size;
        arr=new int[capacity];
        top=-1;
    }
    void push(int x){
        if(top==capacity-1){
            System.out.println("Stack overflow");
            return;
        }
        arr[++top]=x;
    }
    int pop(){
        if(top==-1){
            System.out.println("Stack underflow");
            return -1;

        }
        return arr[top--];

    }
    int peel(){
        if(top==-1){
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top];
    }
    int size(){
        return top+1;
    }
    boolean isEmpty(){
        return top==-1;
    }

}
public class Main {
    public static void main(String[] args) {
        StackArray s = new StackArray(5);

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.pop());   // 30
        System.out.println(s.peek());  // 20
    }
}