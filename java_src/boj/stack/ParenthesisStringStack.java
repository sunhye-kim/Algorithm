package boj.stack;

import java.util.Scanner;

class CharStack{
    private int ptr;
    private char[] stack;

    public CharStack(int max, int ptr){
        this.ptr = ptr;
        this.stack = new char[max];
    }

    public void push(char item){
        stack[ptr++] = item;
    }
    public char pop() {
        if (ptr <= 0)
            return '0';
        return stack[--ptr];
    }
    public int empty(){
        if (ptr == 0)
            return 1;
        return 0;
    }

}

public class ParenthesisStringStack {
    static int checkParenthesis(String str){
        CharStack stack = new CharStack(str.length(), 0);

        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == '('){
                stack.push(c);
            }
            else if(c == ')'){
                char s = stack.pop();
                if (s == '0')
                    return 0;
            }
        }
        if (stack.empty() == 1)
            return 1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int num = Integer.parseInt(stdIn.nextLine());

        String[] parenthesis = new String[num];
        for (int i = 0; i < num; i++) {
            parenthesis[i] = stdIn.nextLine();
        }

        int result;
        for (int i = 0; i < num; i++) {
            result = checkParenthesis(parenthesis[i]);
            if  (result == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
