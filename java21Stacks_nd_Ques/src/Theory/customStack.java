package Theory;

public class customStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public customStack(){
        this(DEFAULT_SIZE);
        // this keyword uses for calling another constructor with the constructor
    }

    public customStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full!!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException {
        if(isEmpty()){
            throw new StackException("cannot pop from an array stack!!");
        }
//         int removed = data[ptr];
//         ptr--;
//         return removed;
        return data[ptr--];
    }
    public int peak() throws Exception {
        if(isEmpty()){
            throw new Exception("cannot peak from an array stack!!");
        }
        return data[ptr];
    }
    public boolean isFull(){
        return ptr == data.length -1; //ptr is at last index
    }
    public boolean isEmpty(){
        return ptr == -1; //ptr is at last index
    }
}
