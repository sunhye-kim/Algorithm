package boj.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Problem1715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            pq.offer(num);
        }

        int sum = 0;
        while (pq.size() > 1){
            int num1 = pq.poll();
            int num2 = pq.poll();

            sum += num1 + num2;
            pq.offer(num1 + num2);
        }

        System.out.println(sum);
    }
}
