package array;

import java.util.Scanner;

public class missingnum {
//    public static int missing(int[] arr,int n) {
//        for (int i=1;i<=n;i++) {
//            boolean found = false;
//            for (int j=0;j< n-1;j++) {
//                if (arr[j]==i) {
//                    found=true;
//                    break;
//                }
//            }
//            if (!found) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a size of an array: ");
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//
//        for(int i=0;i<size;i++) {
//            System.out.print("Enter value of index "+ i + " : ");
//            arr[i] = sc.nextInt();
//        }
//
//        int missingNumber = missing(arr, size);
//        if (missingNumber == -1) {
//            System.out.println("No number is missing.");
//        } else {
//            System.out.println("The missing number is: " + missingNumber);
//        }
//
//        sc.close();
//    }

    public static void printAllMissing(int[] arr, int n) {
        boolean anyMissing = false;
        System.out.print("Missing numbers: ");
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(i + " ");
                anyMissing = true;
            }
        }
        if (!anyMissing) {
            System.out.print("None");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the maximum number in the sequence (n): ");
        int n = sc.nextInt();
        System.out.print("Enter how many numbers you want to input into the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter value of index " + i + " : ");
            arr[i] = sc.nextInt();
        }
        printAllMissing(arr, n);
        sc.close();
    }
}
