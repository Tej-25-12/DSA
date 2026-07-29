package array;

import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static int maxOnes(int[] arr) {
        int maxCount = 0,count = 1;
        for (int i=1;i<arr.length;i++) {
            if(arr[i] == arr[i-1]) {
                count++;
            }
            else {
                maxCount = Math.max(maxCount,count);
                count = 1;
            }
        }
        return Math.max(maxCount,count);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.print("Enter the value of index " + i + " (only 0 or 1): ");
            arr[i] = sc.nextInt();
            if(arr[i] != 0 && arr[i] != 1) {
                System.out.println("Invalid input! Please enter only 0 or 1.");
                i--;
            }
        }
        System.out.println(maxOnes(arr));
        sc.close();
    }
}
