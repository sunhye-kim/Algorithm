package doit_java_algorithm.priority_queue;

public class PriorityQueue {
    private int max; // 큐 용량
    private int num; // 현재 데이터 수
    private int[] que;

    public class EmptyException extends RuntimeException{
        public EmptyException(){}
    }
    public class OverflowGqueueException extends RuntimeException{
        public OverflowGqueueException(){}
    }

    public PriorityQueue(int capacity){
        num = 0;
        max = capacity;
        try{
            que = new int[max];
        } catch (OutOfMemoryError e){
            max = 0;
        }
    }

    public int enque(int x) throws OverflowGqueueException{
        if (num >= max)
            throw new OverflowGqueueException();

        int i;
        for (i = num - 1; i >= 0; i--){
            if (que[i] > x){
                que[i+1] = que[i];
            } else{
                break;
            }
        }
        que[i+1] = x;
        num++;
        return x;
    }

    public int deque() throws EmptyException{
        if (num == 0)
            throw new EmptyException();

        int x = que[0];

        for (int i=0; i < num; i++){
            que[i] = que[i+1];
        }
        num--;
        return x;
    }

    public int peek() throws EmptyException{
        if (num == 0)
            throw new EmptyException();
        return que[0];
    }

    public int size(){
        return num;
    }

    public boolean isEmpty(){
        return num <= 0;
    }
    public void clear(){
        num = 0;
    }
}
