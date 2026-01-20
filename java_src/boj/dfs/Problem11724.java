package boj.dfs;


import java.io.*;
import java.util.*;

public class Problem11724 {
    static boolean[] check;
    static int[][] arr;
    static int count = 0;

    static int node, line;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());

        arr = new int[node + 1][node + 1];
        check = new boolean[node + 1];

        for (int i = 0; i < line; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = arr[b][a] = 1;

        }

        for (int i = 1; i < node + 1; i++) {
            if (!check[i]){
                dfs(i);
                count++;
            }

        }

        System.out.println(count);
    }

    public static void dfs(int start){
        check[start] = true;

        for (int i = 1; i < node + 1; i++){
            if (!check[i] && arr[start][i] == 1){
                dfs(i);
            }
        }
    }
}
