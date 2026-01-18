package boj.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String input = br.readLine();
            Stack<Character> st = new Stack<>();
            boolean flag = true;

            if (input.equals(".")) break;

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c == '(' || c == '[') st.push(c);
                else if (c == ')' || c == ']') {
                    if (st.isEmpty()){
                        flag = false;
                        break;
                    }
                    if (st.peek() == '(' && c == ')') st.pop();
                    else if (st.peek() == '[' && c == ']') st.pop();
                    else {
                        flag = false;
                        break;
                    }
                }
            }

            if (!flag) sb.append("no").append("\n");
            else if (st.isEmpty()) sb.append("yes").append("\n");
            else sb.append("no").append("\n");
        }
        System.out.println(sb);
    }
}
