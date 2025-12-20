package doit_java_algorithm.queue;

import java.util.Scanner;

public class IntQueueTester {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        IntQueue s = new IntQueue(64);

        while (true){
            System.out.println("현재 데이터 수: " + s.size() + " / " + s.capacity());
            System.out.println("(1)인큐 (2)디큐 (3)피크 (4)덤프 (5)서치 (0)종료");

            int menu = stdIn.nextInt();
            if (menu == 0) break;

            int x;
            switch (menu){
                case 1:
                    System.out.println("데이터: ");
                    x = stdIn.nextInt();
                    try {
                        s.enque(x);
                    } catch (IntQueue.OverflowIntQueueException e){
                        System.out.println("큐가 가득 참");
                    }
                    break;
                case 2:
                    try {
                        x = s.deque();
                        System.out.println("디큐 데이터: " + x);
                    } catch (IntQueue.EmptyIntQueueException e){
                        System.out.println("큐가 비어있음");
                    }
                    break;
                case 3:
                    try {
                        x = s.peek();
                        System.out.println("피크 데이터: " + x);
                    } catch (IntQueue.EmptyIntQueueException e){
                        System.out.println("큐가 비어있음");
                    }
                    break;
                case 4:
                    s.dump();
                    break;
                case 5:
                    try {
                        x = s.search(35);
                        if (x == 0)
                            System.out.println("해당하는 숫자 없음");
                        else
                            System.out.println(x + "번째 요소에 존재함");
                    } catch (IntQueue.EmptyIntQueueException e){
                        System.out.println("큐가 비어있음");
                    }
            }
        }
    }
}
