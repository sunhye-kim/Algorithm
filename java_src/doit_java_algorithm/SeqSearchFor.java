package doit_java_algorithm;

import java.util.Scanner;

public class SeqSearchFor {
    static int seqSearch(int[] arr, int n, int x) {
        for (int i = 0; i < n; i++)
            if (arr[i] == x)
                return i;

        return -1;
    }
    static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Enter the number of elements you want to search: ");
        int n = stdIn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = stdIn.nextInt();
        }

        System.out.print("Enter the element you want to search: ");
        int x = stdIn.nextInt();
        int idx = seqSearch(arr, n, x);

        if (idx == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + idx);
    }
}
