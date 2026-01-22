package boj.bfs;

import java.io.*;
import java.util.*;

public class Problem4963 {
    static int[][] graph;
    static boolean[][] visited;
    static int w;
    static int h;
    static int dx[] = {0, 0, -1 ,1, -1, 1, -1, 1}; // 상 하 좌 우 대각선 상좌, 상우, 하좌, 하우
    static int dy[] = {-1, 1, 0, 0, 1, 1, -1, -1}; // 상 하 좌 우 대각선 상좌, 상우, 하좌, 하우

    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;
        while (true){
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if (w == 0 && h == 0) break;

            graph = new int[h][w];
            visited = new boolean[h][w];

            for (int i = 0; i < h; i++){
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++){
                    graph[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int result_count = 0;
            for (int i = 0; i < h; i++){
                for (int j = 0; j < w; j++){
                    if (!visited[i][j] && graph[i][j] == 1){
                        bfs(i, j);
                        result_count++;
                    }
                }
            }
            sb.append(result_count).append("\n");
        }

        System.out.println(sb);
    }

    public static void bfs(int row, int col){
        Queue<Node> q = new LinkedList<>();
        visited[row][col] = true;
        q.offer(new Node(row, col));

        while (!q.isEmpty()){
            Node node = q.poll();
            for (int i=0; i<8; i++){
                int nowx = node.x + dx[i];
                int nowy = node.y + dy[i];
                if (nowx >=0 && nowx < h && nowy >=0 && nowy < w){
                    if (!visited[nowx][nowy] && graph[nowx][nowy] == 1){
                        visited[nowx][nowy] = true;
                        q.offer(new Node(nowx,nowy));
                    }
                }
            }
        }
    }

}
