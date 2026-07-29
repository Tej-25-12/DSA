package array;

import java.util.*;

public class array_Rotation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++) {
            System.out.print("Enter the value of index "+ i +" : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Number of rotations reuired: ");
        int k = sc.nextInt();
        k = k % size;
        System.out.println("Choose Rotation Type: \n 1. Left Rotation \n 2. Right Rotation");
        int choice = sc.nextInt();
        if (choice == 1) {
            for (int j = 0; j < k; j++) {
                int temp = arr[0];
                for (int i = 0; i < size-1;i++) {
                    arr[i] = arr[i+1];
                }
                arr[size-1] = temp;
            }
            System.out.println("Array after Left Rotation:");
            System.out.println(Arrays.toString(arr));
        }
        else if (choice == 2) {
            for (int j = 0; j < k; j++) {
                int temp = arr[size-1];
                for (int i = size-1; i > 0;i--) {
                    arr[i] = arr[i-1];
                }
                arr[0] = temp;
            }
            System.out.println("Array after Right Rotation:");
            System.out.println(Arrays.toString(arr));
        }
        else {
            System.out.println("Invalid Choice!");
        }
    }
}
