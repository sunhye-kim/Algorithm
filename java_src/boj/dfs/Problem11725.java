package boj.dfs;


import java.io.*;
import java.util.*;

public class Problem11725 {
    static boolean[] check;
    static int[][] arr;
    static int count = 0;

    static int node;

    static int[] result;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        node = Integer.parseInt(br.readLine());

        arr = new int[node + 1][node + 1];
        check = new boolean[node + 1];
        result = new int[node + 1];

        for (int i = 0; i < (node - 1); i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = arr[b][a] = 1;
        }

        for (int i = 1; i < (node + 1); i++) {
            if (arr[1][i] == 1 && !check[i]) dfs(1, i);
        }

        for (int i = 2; i <= node; i++) {
            System.out.println(result[i]);
        }
    }

    public static void dfs(int row, int col){
        check[row] = true;
        result[col] = row;


        for (int i = 1; i < (node + 1); i++){
            if (!check[i] && arr[col][i] == 1){
                dfs(col, i);
            }

        }

    }
}
