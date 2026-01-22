package boj.bfs;

import java.io.*;
import java.util.*;

public class Problem1012 {
    static int[][] arr;
    static boolean[][] visited;
    static int dx[] = {0, 0, -1 ,1}; // 상 하 좌 우
    static int xy[] = {-1, 1, 0, 0}; // 상 하 좌 우
    static int M;
    static int N;

    static class Node{
        int x;
        int y;
        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken()); // 가로 길어
            N = Integer.parseInt(st.nextToken()); // 세로 길이
            int K = Integer.parseInt(st.nextToken()); // 배추 위치

            arr = new int[N][M];
            visited = new boolean[N][M];
            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                arr[y][x] = 1;
            }

            int count = 0;
            for (int j = 0; j < N; j++) {
                for (int h = 0; h < M; h++) {
                    if (!visited[j][h] && arr[j][h] == 1) {
                        bfs(h, j);
                        count++;
                    }
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }

    public static void bfs(int x, int y){
        Queue<Node> q = new LinkedList<>();
        visited[y][x] = true;
        q.add(new Node(x, y));
        while (!q.isEmpty()){
            Node node = q.poll();
            for(int i = 0; i < 4; i++){
                int nx = node.x + dx[i];
                int ny = node.y + xy[i];
                if (nx >= 0 && nx < M && ny >= 0 && ny < N){
                    if (!visited[ny][nx] && arr[ny][nx] == 1){
                        visited[ny][nx] = true;
                        q.add(new Node(nx, ny));
                    }
                }
            }
        }

    }
}