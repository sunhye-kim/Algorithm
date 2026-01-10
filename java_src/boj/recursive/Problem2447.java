package boj.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2447 {
    static int[][] arr;
    static int[][] pattern;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        pattern = new int[3][3];
        for(int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                if (i == 1 & j == 1) pattern[i][j] = 0;
                else pattern[i][j] = 1;
            }
        }

        star(N);

        for (int i=0; i<N; i++){
            for (int j=0; j<N; j++){
                if (pattern[i][j] == 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void star(int N){
        if (N != 3){
            star(N/3);
        }
        
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                if (i  >= N/3 & i < (N/3 + N/3) & j >= N/3 & j < (N/3 + N/3)) continue;

                arr[i][j] = pattern[i%(N/3)][j%(N/3)];
            }
        }

        pattern = new int[N][N];
        for (int i=0; i<pattern.length; i++){
            System.arraycopy(arr[i], 0, pattern[i], 0, N);
        }
    }
}
