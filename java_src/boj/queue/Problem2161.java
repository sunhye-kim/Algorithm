package boj.queue;

import java.util.*;

public class Problem2161 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        int num = 1;
        while (!q.isEmpty()) {
            int result = q.poll();
            if (num % 2 == 1) {
                System.out.print(result + " ");
            } else {
                q.add(result);
            }
            num++;
        }
    }
}
