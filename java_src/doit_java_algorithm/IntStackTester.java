package doit_java_algorithm;

import java.util.Scanner;

public class IntStackTester {
    static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        IntStack s = new IntStack(64);

        while(true){
            System.out.println("현재 데이터 수 : " + s.size() + "/" + s.capacity());
            System.out.println("1.푸시 2.팝 3.피크 4.덤프 0.종료");
            int menu = stdIn.nextInt();
            if (menu == 0)
                break;

            int x;
            switch (menu){
                case 1:
                    System.out.print("데이터 입력:");
                    x = stdIn.nextInt();
                    try{
                        s.push(x);
                    } catch(IntStack.OverflowIntStackException e){
                        System.out.println("스택이 가득찼습니다");
                    }
                    break;
                case 2:
                    try {
                        s.pop();
                    } catch (IntStack.EmptyIntStacException e) {
                        System.out.println("스택이 비었습니다");
                    }
                    break;
                case 3:
                    try {
                        x = s.peek();
                        System.out.println("피크한 숫자는 " + x + "입니다");
                    } catch (IntStack.EmptyIntStacException e) {
                        System.out.println("스택이 비었습니다");
                    }
                    break;
                case 4:
                    s.dump();
                    break;
            }
        }
    }
}
