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
    static ArrayList<Integer>[] arr = new ArrayList[3];
    static StringBuilder sb = new StringBuilder();
    static int K;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        K = Integer.parseInt(br.readLine());
        count = 0;

        for (int i = 0; i < 3; i++) arr[i] = new ArrayList<>();
        for (int i = 1; i <= K; i++) arr[0].add(i);

        recursion(1, 0);

        System.out.println(count);
        System.out.println(sb);


    }
    public static void recursion(int num, int rod){
        if (num >= K) return;

        for (int i = 0; i < 3; i++){
            if (i == rod) continue;

            if (!arr[i].isEmpty()){
                if (num > arr[i].get(arr[i].size()-1)){
                    continue;
                }
            }

            count++;
            sb.append(rod + 1).append(' ').append(i + 1).append('\n');
            recursion(num, i);

        }
    }
}