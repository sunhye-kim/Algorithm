package boj.recursive;

// boj 11729
/*
input:
3
output:
7
1 3
1 2
3 2
1 3
2 1
2 3
1 3

 */
import java.io.*;
import java.util.*;

public class Problem11792 {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());

        int count = recursion(K, 1, 3, 2);

        System.out.println(count);
        System.out.println(sb);


    }
    public static int recursion(int num, int start, int to, int temp){
        if (num == 0) return 0;

        int count=0;

        // 1. n-1개를 start → temp
        count += recursion(num -1, start, temp, to);
        count++;
        // 2. 제일 큰 원판 이동
        sb.append(start).append(" ").append(to).append("\n");
        // 3. n-1개를 temp -> to
        count += recursion(num -1, temp, to, start);
        return count;
    }
}