package boj.dfs;


import java.io.*;
import java.util.*;

public class Problem11725 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int[] parent;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        graph = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        parent = new int[N + 1];

        // 인접 리스트 초기화
        for (int i=0; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < (N - 1); i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        dfs(1);

        for (int i = 2; i <= N; i++) {
            System.out.println(parent[i]);
        }
    }

    public static void dfs(int node){
        visited[node] = true;

        for (int next : graph[node]) {
            if (!visited[next]) {
                parent[next] = node;
                dfs(next);
            }
        }
    }
}
