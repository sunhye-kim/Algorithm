package boj.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Problem10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int rear = 0;

        StringTokenizer st;
        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());

            String order = st.nextToken();
            switch (order) {
                case "push":
                    rear = Integer.parseInt(st.nextToken());
                    q.offer(rear);
                    break;
                case "pop":
                    sb.append(q.isEmpty() ? -1 : q.poll()).append("\n");
                    break;
                case "front":
                    sb.append(q.isEmpty() ? -1 : q.element()).append("\n");
                    break;
                case "back":
                    sb.append(q.isEmpty()? -1 : rear).append("\n");
                    break;
                case "size":
                    sb.append(q.size()).append("\n");
                    break;
                case "empty":
                    sb.append(q.isEmpty() ? 1 : 0).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
