package doit_java_algorithm;
import java.util.Scanner;


class SeqSearch {
    static int seqSearch(int[] a, int n, int key) {
        int i=0;

        while (true){
            if (i==n)
                return -1;
            if (a[i]==key)
                return i;
            i++;
        }
    }

    static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = stdIn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "]: ");
            arr[i] = stdIn.nextInt();
        }

        System.out.print("Enter the element to be searched: ");
        int x = stdIn.nextInt();
        int idx = seqSearch(arr, n, x);

        if (idx == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + idx);
    }
}


