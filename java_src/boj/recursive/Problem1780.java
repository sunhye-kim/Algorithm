package boj.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem1780 {
    public static int minusOne = 0;
    public static int zero = 0;
    public static int one = 0;
    public static int[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =  Integer.parseInt(br.readLine());
        board = new int[N][N];

        StringTokenizer st;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            for(int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        partition(0,0,N);
        System.out.println(minusOne);
        System.out.println(zero);
        System.out.println(one);

    }

    static void partition(int row, int col, int size){
        if (check(row, col, size)){
            if (board[row][col] == -1) minusOne++;
            else if (board[row][col] == 0) zero++;
            else one++;
            return;
        }

        int newSize = size/3;

        partition(row, col, newSize);
        partition(row, col + newSize, newSize);
        partition(row, col + newSize + newSize, newSize);
        partition(row + newSize, col, newSize);
        partition(row + newSize, col + newSize, newSize);
        partition(row + newSize, col + newSize + newSize, newSize);
        partition(row + newSize + newSize, col, newSize);
        partition(row + newSize + newSize, col + newSize, newSize);
        partition(row + newSize + newSize, col + newSize + newSize, newSize);


    }

    static boolean check(int row, int col, int size){
        int num = board[row][col];

        for (int i=row; i < row + size; i++){
            for (int j = col; j < col + size; j++){
                if (board[i][j] != num) return false;
            }
        }
        return true;
    }
}