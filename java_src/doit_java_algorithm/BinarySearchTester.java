package doit_java_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Enter number to search: ");
        int num = stdIn.nextInt();

        int[] arr = new int[num];
        System.out.print("Enter the element in the array (ascending): ");

        System.out.print("x[0]: ");
        arr[0] = stdIn.nextInt();

        for (int i = 1; i < num; i++) {
            do{
                System.out.print("x[" + i + "]: ");
                arr[i] = stdIn.nextInt();
            } while(arr[i] < arr[i-1]);
        }

        System.out.print("Enter element to be searched: ");
        int search = stdIn.nextInt();

        int idx = Arrays.binarySearch(arr, search);
        if (idx < 0) {
            System.out.println("Element not found at index");
        }
        else {
            System.out.println("Element found at index " + idx);
        }
    }
}
