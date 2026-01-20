package boj.dfs;

import java.io.*;
import java.util.*;

public class Problem2667 {
    static boolean[][] check;
    static int[][] arr;
    static int count = 0;

    static int node;

    static ArrayList<Integer> result;

    // 상하좌우 방향
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        node = Integer.parseInt(br.readLine());

        arr = new int[node + 1][node + 1];
        check = new boolean[node + 1][node + 1];
        result = new ArrayList<>();

        for (int i = 0; i < node; i++) {
            String row = br.readLine();
            String[] split_row = row.split("");
            for (int j = 0; j < row.length(); j++) {
                arr[i][j] = Integer.parseInt(split_row[j]);
            }
        }

        for (int i = 0; i < node; i++) {
            for (int j = 0; j < node; j++) {
                if (!check[i][j] && arr[i][j] == 1){
                    count = 0;
                    dfs(i,j);
                    result.add(count);


                }
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static void dfs(int row, int col){
        check[row][col] = true;
        count++;

        for (int i=0; i < 4; i++) {
            int nx = row + dx[i];
            int ny = col + dy[i];
            if (nx >= 0 && nx < node && ny >= 0 && ny < node){
                if (!check[nx][ny] && arr[nx][ny] == 1){
                    dfs(nx, ny);
                }
            }
        }

    }
}