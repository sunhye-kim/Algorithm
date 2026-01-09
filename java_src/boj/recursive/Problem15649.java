package boj.recursive;

import java.io.*;
import java.util.*;

public class Problem15649 {
    static int N;
    static int M;
    static int[] result;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());


        result = new int[M];
        visit = new boolean[N + 1];
        back(0, 0);

        System.out.print(sb);
    }

    static void back(int before, int depth) {
        if (depth == M) {
            for (int val : result) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (visit[i]) continue;
            result[depth] = i;
            visit[i] = true;
            back(i, depth + 1);
            visit[i] = false;
        }
    }
}
