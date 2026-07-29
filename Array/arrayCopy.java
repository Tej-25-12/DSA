package array;

import java.util.Arrays;
import java.util.Scanner;

public class arrayCopy {
    public static void search(int arr[]) {
        int[] arr1 = new int[arr.length];
        for (int i=0; i < arr.length;i++) {
            arr1[i] = arr[i];
        }
        System.out.println("new array: "+ Arrays.toString(arr1));
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i=0;i < size; i++) {
            System.out.print("Enter value of an index "+ i + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Old Array: "+ Arrays.toString(arr));
        search(arr);

        sc.close();
    }
}
