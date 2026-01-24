package boj.recursive;

// boj 4779
/*
input:
0
1
3
2
output:
-
- -
- -   - -         - -   - -
- -   - -

 */
import java.io.*;
import java.util.*;

public class Problem4779 {
    static char[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        String str;
        while((str=br.readLine())!=null){
            if (str.equals("")) break;
            int n = Integer.parseInt(str);
            int a = (int) Math.pow(3, n);
            arr = new char[a + 1];
            Arrays.fill(arr, '-');

            recursion(1, a);

            sb.append(arr, 1, arr.length - 1).append('\n');
        }
        System.out.println(sb);
    }
    public static void recursion(int start, int end){
        if(start == end) return;

        int s = start + (end-start) / 3 + 1;
        int e = end - (end-start) / 3 - 1;

        for(int i = s; i <= e; i++){
            arr[i] = ' ';
        }
        recursion(start, s-1);
        recursion(e + 1, end);
    }
}
