package boj.recursive;

import java.io.*;
import java.util.*;

public class Problem6603 {
    static int[] arr;
    static int[] result = new int[6];
    static int n;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());

            if (n == 0) break;  // 입력 종료

            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            back(0, 0);
            sb.append("\n");  // 테스트케이스 사이 빈 줄
        }

        System.out.print(sb);
    }

    static void back(int start, int depth) {
        // 6개 다 골랐으면 출력
        if (depth == 6) {
            for (int val : result) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        // start부터 끝까지 하나씩 골라봄
        for (int i = start; i < n; i++) {
            result[depth] = arr[i];
            back(i + 1, depth + 1);
        }
    }
}