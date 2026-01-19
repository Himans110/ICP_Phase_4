package Stack_ICP;

public class Stack {
    private int []arr;
    private int pointer = 0;
    public  Stack(int n){
        arr = new int[n];
    }
    public void push(int val){
        if(pointer == arr.length) {
            System.out.println("Stack Overflow.........");
            return;
        }
        arr[pointer] = val;
        pointer++;
    }
    public int pop(){
        if(pointer == 0) {
            System.out.println("Stack Underflow...............");
            return -1;
        }
        pointer--;
        return arr[pointer];
    }
    public int peek(){
        if(pointer == 0) {
            System.out.println("Stack Underflow...............");
            return -1;
        }
        else if(pointer == arr.length) {
            System.out.println("Stack Overflow.........");
            return -1;
        }
        return arr[pointer];
    }
    public boolean isEmpty(){
        if(arr.length == 0) return true;
        return false;
    }
}
