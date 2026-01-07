package boj.heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            map.put(Integer.parseInt(line[i]), 0);
        }

        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        String[] lineM = br.readLine().split(" ");
        for (int i = 0; i < M; i++) {

            sb.append(map.containsKey(Integer.parseInt(lineM[i]))? 1: 0).append("\n");
        }

        System.out.println(sb);
    }
}
