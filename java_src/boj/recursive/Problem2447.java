package boj.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2447 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(isStar(i,j)? "*" : " ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    public static boolean isStar(int x, int y) {
        while (x > 0 || y > 0) {
            if (x%3 == 1 && y%3 == 1) {
                return false;
            }
            x /= 3;
            y /= 3;
        }
        return true;
    }
}
