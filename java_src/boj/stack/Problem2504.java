package boj.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Stack;

public class Problem2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Stack<Character> s = new Stack<>();
        while (true){
            if (!st.hasMoreTokens()) break;

            char ch = st.nextToken().charAt(0);

            if (ch == '(' || ch == '[') {
                s.push(ch);
            } else if (ch == ')'){
                if (s.peek() == '(') {
                    s.pop();
                } else  break;
            } else if (ch == ']') {
                if (s.peek() == '[') {
                    s.pop();
                } else  break;
            }
        }

        if (!s.isEmpty()) System.out.println(0);

    }
}
