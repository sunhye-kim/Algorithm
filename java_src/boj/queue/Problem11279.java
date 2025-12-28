package boj.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Problem11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int t;
        for (int i = 0; i < N; i++) {
            t = Integer.parseInt(br.readLine());
            if (t == 0){
                if (pq.isEmpty())
                    System.out.println(0);
                else
                    System.out.println(pq.poll());
            } else
                pq.add(t);
        }
    }
}
