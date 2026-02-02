package boj.dfs;

// boj 2667
/*
input:
7
0110100
0110101
1110101
0000111
0100000
0111110
0111000
output:
3
7
8
9

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Problem2667_2 {
    static int dx[] = {0,0,-1,1}; // 상 하 좌 우
    static int dy[] = {1,-1,0,0};
    static int[][] arr;
    static int[][] visited;
    static int N;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        ArrayList<Integer> result = new ArrayList();

        arr = new int[N][N];
        visited = new int[N][N];
        for (int i = 0; i < N; i++) {
            String doc = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(doc.charAt(j) + "");
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 0) continue;
                if (visited[i][j] == 1) continue;

                count = 0;
                dfs(j,i);
                result.add(count);

            }
        }

        int result_size = result.size();
        System.out.println(result_size);

        Collections.sort(result);
        for (int i = 0; i < result_size; i++) {
            System.out.println(result.get(i));
        }
    }

    public static void dfs(int x, int y){
        if (visited[y][x] == 1) return;

        visited[y][x] = 1;
        if (arr[y][x] == 0) return;
        count++;

        for (int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                dfs(nx, ny);
            }
        }
    }
}
