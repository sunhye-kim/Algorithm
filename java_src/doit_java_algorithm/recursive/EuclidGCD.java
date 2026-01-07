package doit_java_algorithm.recursive;

import java.util.Scanner;

public class EuclidGCD {
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("최대 공약수: "+ gcd(a, b));
    }
}
