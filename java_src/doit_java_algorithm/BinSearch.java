package doit_java_algorithm;

import java.util.Scanner;

public class BinSearch {
    static int binSearch(int[] a, int n, int x){
        int pl = 0;
        int pr = n - 1;

        while (pl <= pr){
            int mid = (pl+pr)/2;
            System.out.println(pl + " " + pr + " " + mid);
            if (a[mid]==x)
                return mid;
            else if (a[mid]>x)
                pr=mid-1;
            else
                pl=mid+1;
        }
        return -1;
    }
    static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = stdIn.nextInt();
        int[] arr = new int[n];


        System.out.print("arr[0]: ");
        arr[0] = stdIn.nextInt();

        for (int i = 1; i < n; i++) {
            do {
                System.out.print("arr[" + i + "]: ");
                arr[i] = stdIn.nextInt();
            } while (arr[i] < arr[i-1]);
        }

        System.out.print("Enter the element to be searched: ");
        int x = stdIn.nextInt();

        int idx = binSearch(arr, n, x);
        if (idx == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + idx);


    }
}
