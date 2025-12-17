package boj.stack;

import java.util.Scanner;

class Stack{
    private int max;
    private int ptr;
    private int[] stk;

    public Stack(int size){
        ptr = 0;
        max = size;
        stk = new int[max];
    }
    public void push(int n){
        stk[ptr++]=n;
    }
    public int pop(){
        if (ptr <= 0)
            return -1;
        return stk[--ptr];
    }
    public int size(){
        return ptr;
    }
    public int empty(){
        if  (ptr == 0)
            return 1;
        return 0;
    }
    public int top(){
        if (empty() == 1)
            return -1;
        return stk[ptr-1];
    }
}

public class StackTest {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int num = Integer.parseInt(stdIn.nextLine());

        String[] dir = new String[num];
        for (int i = 0; i < num; i++) {
            dir[i] = stdIn.nextLine();
        }

        Stack st = new Stack(num);
        for (int i = 0; i < num; i++) {
            String[] arr = dir[i].split(" ");
            String command = arr[0];
            switch (command) {
                case "push":
                    st.push(Integer.parseInt(arr[1]));
                    break;
                case "pop":
                    Integer result = st.pop();
                    System.out.println(result);
                    break;
                case "top":
                    System.out.println(st.top());
                    break;
                case "empty":
                    System.out.println(st.empty());
                    break;
                case "size":
                    System.out.println(st.size());
                    break;
            }
        }

    }
}