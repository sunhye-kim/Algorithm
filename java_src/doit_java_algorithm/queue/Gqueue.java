package doit_java_algorithm.queue;

public class Gqueue<E> {
    private int max;    // 큐의 용량
    private int front;  // 첫 번째 요소의 인덱스
    private int rear;   // 다음에 저장될 요소의 인덱스
    private int num;    // 현재 데이터 수
    private E[] que;    // 큐 본체 (객체 배열)

    // 실행 시 예외: 큐가 비어 있음
    public static class EmptyGqueueException extends RuntimeException {
        public EmptyGqueueException() {}
    }

    // 실행 시 예외: 큐가 가득 참
    public static class OverflowGqueueException extends RuntimeException {
        public OverflowGqueueException() {}
    }

    // 생성자
    @SuppressWarnings("unchecked")
    public Gqueue(int capacity) {
        num = front = rear = 0;
        max = capacity;
        try {
            // E 타입의 배열을 직접 생성할 수 없으므로 Object 배열을 생성 후 형변환
            que = (E[]) new Object[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    // 데이터 인큐
    public E enque(E x) throws OverflowGqueueException {
        if (num >= max)
            throw new OverflowGqueueException();
        que[rear++] = x;
        num++;
        if (rear == max)
            rear = 0;
        return x;
    }

    // 데이터 디큐
    public E deque() throws EmptyGqueueException {
        if (num <= 0)
            throw new EmptyGqueueException();
        E x = que[front++];
        num--;
        if (front == max)
            front = 0;
        return x;
    }

    // 큐의 맨 앞 데이터를 들여다봄
    public E peek() throws EmptyGqueueException {
        if (num <= 0)
            throw new EmptyGqueueException();
        return que[front];
    }

    // 큐에서 x를 찾아 인덱스(배열의 물리적 위치)를 반환
    public int indexOf(E x) {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % max;
            if (que[idx].equals(x)) // 객체 비교이므로 equals 사용
                return idx;
        }
        return -1;
    }

    // 큐에서 x를 찾아 몇 번째에 있는지(1부터 시작)를 반환
    public int search(E x) {
        for (int i = 0; i < num; i++) {
            if (que[(i + front) % max].equals(x))
                return i + 1;
        }
        return 0;
    }

    public void clear() {
        num = front = rear = 0;
        // 객체 참조를 해제하여 GC가 수거할 수 있도록 함 (선택 사항)
        // for(int i=0; i<max; i++) que[i] = null;
    }

    public int capacity() { return max; }
    public int size() { return num; }
    public boolean isEmpty() { return num <= 0; }
    public boolean isFull() { return num >= max; }

    public void dump() {
        if (num <= 0) {
            System.out.println("큐가 비어있습니다.");
        } else {
            for (int i = 0; i < num; i++) {
                System.out.print(que[(i + front) % max] + " ");
            }
            System.out.println();
        }
    }
}
