package doit_java_algorithm.recursive;

import java.util.Scanner;

public class Hanoi {
    static void move(int no, int x, int y){
        if (no > 1) move(no-1, x, 6-x-y);

        System.out.println("원반" + no + "을 " + x + "에서 " + y + "로 옮김");

        if (no > 1) move(no-1, 6-x-y, y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // x: 시작 기둥 번호, y: 목표 기둥 번호
        move(n, 1, 3);
    }
}
