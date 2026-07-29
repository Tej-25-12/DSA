package array;

import java.util.Scanner;

public class moveNegative {
    public static void arrange(int[] arr) {
        int left = 0, right = arr.length-1;
        while(left < right) {
            if(arr[left] < 0) {
                left++;
            } else if(arr[right] > 0) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        System.out.print("Array after moving negatives: ");
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<arr.length; i++) {
            System.out.print("Enter the value of array at index "+ i + ": ");
            arr[i] = sc.nextInt();
        }
        arrange(arr);
        sc.close();
    }
}
