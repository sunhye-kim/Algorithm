package boj.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;


public class Problem7662 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());

            Map<Integer, Integer> map = new HashMap<>();
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            PriorityQueue<Integer> rpq = new PriorityQueue<>(Comparator.reverseOrder());

            for (int j = 0; j < k; j++) {
                String[] s = br.readLine().split(" ");
                String d = s[0];
                int n =  Integer.parseInt(s[1]);

                if (d.equals("I")) {
                    map.put(n, map.getOrDefault(n, 0) + 1);

                    pq.offer(n);
                    rpq.offer(n);
                } else {
                    if (map.isEmpty()) continue;

                    if (n == 1) removeMap(rpq, map);
                    else removeMap(pq, map);
                }
            }

            if (map.isEmpty())
                System.out.println("EMPTY");
            else {
                int n = removeMap(rpq, map);
                System.out.println(n + " " + (!map.isEmpty() ? removeMap(pq, map) : n));
            }
        }
    }

    static int removeMap(PriorityQueue<Integer> que, Map<Integer, Integer> map) {
        int num;
        while (true) {
            num = que.poll();
            int cnt = map.getOrDefault(num, 0);

            if (cnt == 0)
                continue;

            if (cnt == 1)
                map.remove(num);
            else
                map.put(num, cnt - 1);

            break;
        }

        return num;
    }
}
