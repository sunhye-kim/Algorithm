package boj.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;


public class Problem7662 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> rpq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int count = 0;

            for (int j = 0; j < k; j++) {
                String[] s = br.readLine().split(" ");
                String d = s[0];
                int n =  Integer.parseInt(s[1]);

                if (d.equals("I")) {
                    count++;
                    pq.offer(n);
                    rpq.offer(n);
                } else {
                    if (count > 0) count--;
                    if (n == 1) {
                        int max = rpq.poll();
                        pq.remove(max);
                    }
                    else pq.poll();
                }
            }

            if (count > 0) sb.append(rpq.poll()).append(" ").append(pq.poll()).append("\n");
            else sb.append("EMPTY").append("\n");

            pq.clear();
            rpq.clear();
        }

        System.out.println(sb);
    }
}
