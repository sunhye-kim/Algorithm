package boj.bfs;

import java.io.*;
import java.util.*;

public class Problem18352 {
    static ArrayList<Integer>[] graph;
    static int[] distance;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 도시 개수
        int M = Integer.parseInt(st.nextToken()); // 도로 개수
        int K = Integer.parseInt(st.nextToken()); // 거리 정보
        int X = Integer.parseInt(st.nextToken()); // 출발 도시 번호

        graph = new ArrayList[N + 1];
        distance = new int[N + 1];
        Arrays.fill(distance, -1); // 미방문 처리

        // 인접 리스트 초기화
        for (int i=0; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
        }

        bfs(X);

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i=0; i <= N; i++) {
            if (distance[i] == K) {
                ans.add(i);
            }
        }

        if (ans.size() == 0) {
            System.out.println(-1);
        } else {
            Collections.sort(ans);
            for (int i : ans) {
                System.out.println(i);
            }
        }
    }

    public static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        distance[start] = 0;

        while (!q.isEmpty()){
            int now = q.poll();
            for (int next:graph[now]){
                if (distance[next] == -1){
                    distance[next] = distance[now] + 1;
                    q.offer(next);
                }
            }
        }
    }

}
