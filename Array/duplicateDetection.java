package array;

import java.util.Scanner;

public class duplicateDetection {
//    public static int duplicate(int arr[]) {
//        for (int i=0;i < arr.length;i++) {
//            for (int j=i+1; j < arr.length; j++) {
//                if(arr[i] == arr[j]) {
//                   return arr[i];
//                }
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter size of an aray: ");
//        int size = sc.nextInt();
//        int arr[] = new int[size];
//        for (int i=0; i< size ; i++) {
//            System.out.print("Enter vale of an index "+ i + " : ");
//            arr[i] = sc.nextInt();
//        }
//        int entry = duplicate(arr);
//        if (entry == -1) {
//            System.out.println("No Duplicate Entry Found.");
//        } else {
//            System.out.println("Duplucate entry found : "+ entry);
//        }
//    }

    public static void findAllDuplicates(int arr[]) {
        boolean found = false;
        System.out.print("Duplicate entries found: ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.print("None");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter value of index " + i + " : ");
            arr[i] = sc.nextInt();
        }
        findAllDuplicates(arr);
        sc.close();
    }
}