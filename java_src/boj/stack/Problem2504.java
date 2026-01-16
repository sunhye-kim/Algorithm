package boj.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        Stack<Character> s = new Stack<>();
        int result = 0;
        int tmp = 1;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '(') {
                s.push(ch);
                tmp *= 2;
            } else if (ch == '['){
                s.push(ch);
                tmp *= 3;
            } else if (ch == ')'){
                if (s.isEmpty() || s.peek() != '(') {
                    result = 0;
                    break;
                }
                if (input.charAt(i-1) == '(') {
                    result += tmp;
                }
                s.pop();
                tmp /= 2;
            } else if (ch == ']') {
                if (s.isEmpty() || s.peek() != '[') {
                    result = 0;
                    break;
                }
                if (input.charAt(i-1) == '[') {
                    result += tmp;
                }
                s.pop();
                tmp /= 3;
            }
        }

        if (!s.isEmpty()) {
            result = 0;
        }
        System.out.println(result);

    }
}
