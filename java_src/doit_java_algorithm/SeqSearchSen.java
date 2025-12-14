package doit_java_algorithm;

import java.util.Scanner;

public class SeqSearchSen {
    static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;
        a[n] = key;

        while (true) {
            if (a[i] == key)
                break;
            i++;
        }
        return i == n ? -1 : i;
    }
    static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Enter the number of elements you want in the array: ");
        int n = stdIn.nextInt();
        int[] arr = new int[n + 1];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = stdIn.nextInt();
        }

        System.out.print("Enter the element you want in the array: ");
        int x = stdIn.nextInt();
        int idx = seqSearchSen(arr, n, x);

        if (idx == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + idx);

    }
}
