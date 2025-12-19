package boj.stack;

import java.util.Scanner;

class CharStack2{
    private int ptr;
    private char[] arr;

    public CharStack2(){
        ptr = 0;
        arr = new char[100];
    }

    public void push(char ch){
        arr[ptr++] = ch;
    }
    public char pop(char ch){
        if (ptr <= 0)
            return '0';

        char result = arr[--ptr];
        if (result == '(' & ch == ')')
            return result;
        if (result == '[' & ch == ']')
            return result;
        return '0';
    }
    public boolean isEmpty(){
        if (ptr == 0)
            return true;
        return false;
    }
}
public class ParenthesesStringStack2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        while (true){
            String sentence = stdIn.nextLine();
            String result = "yes";
            if (sentence.equals(".")){
                break;
            }

            CharStack2 stack = new CharStack2();
            for (int i = 0; i < sentence.length(); i++) {
                char ch = sentence.charAt(i);
                if (ch == '(' || ch == '[') {
                    stack.push(ch);
                }
                else if (ch == ')' || ch == ']') {
                    char popResult = stack.pop(ch);
                    if (popResult == '0'){
                        result = "no";
                        break;
                    }
                }
            }

            if (result.equals("no")) {
                System.out.println("no");
                continue;
            }

            if (stack.isEmpty()){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}
