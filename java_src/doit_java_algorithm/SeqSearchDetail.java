package doit_java_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class SeqSearchDetail {
    static int seqSearch(int[] arr, int n, int x){
        char[] star = new char[n];
        Arrays.fill(star, ' ');

        StringBuilder arrStr = new StringBuilder();
        for (int i = 0; i < n; i++) {
            arrStr.append(String.format("%2d",  arr[i]));
        }
        for (int i = 0; i < n; i++){
            star[i] = '*';
            System.out.println(i +"|"+ new String(star));
            System.out.println(" |" + arrStr);
            star[i] = ' ';

            if (arr[i] == x)
                return i;
            System.out.println(" |");
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array");
        int n = stdIn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for(int i = 0; i < n; i++)
            arr[i] = stdIn.nextInt();


        System.out.println("Enter the element to be searched");
        int search = stdIn.nextInt();

        System.out.print(" |");
        for (int i = 0; i < n; i++) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println("-+-------");

        int result = seqSearch(arr, n, search);
        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println(search + "은 x[" + result + "] 에 있습니다");
    }
}
