package boj.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1074 {
    public static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());


        find(r, c, N);

        System.out.print(result);


    }

    public static void find(int r, int c, int N) {
        if (N < 1)  return;
        int size = (int) Math.pow(2, N);
        if (r < size / 2 && c < size / 2) {
            // 1 사분면
            result += Math.pow(4, N) / 4 * 0;
            find(r, c, N - 1);
        } else if (r < size / 2 && c >= size / 2) {
            // 2 사분면
            result += Math.pow(4, N) / 4 * 1;
            find(r, c - size / 2, N - 1);
        } else if (r >= size / 2 && c < size / 2) {
            // 3 사분면
            result += Math.pow(4, N) / 4 * 2;
            find(r - size / 2, c, N - 1);
        } else if (r >= size / 2 && c >= size / 2) {
            // 4 사분면
            result += Math.pow(4, N) / 4 * 3;
            find(r - size / 2, c - size / 2, N - 1);
        }
    }
}
