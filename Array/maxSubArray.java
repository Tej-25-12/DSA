package array;

import java.util.Scanner;
public class maxSubArray {
    public static void max (int[] arr) {
        int sum =arr[0];
        int maxEnding = arr[0];
        for (int i=1;i<arr.length;i++) {
            maxEnding = Math.max(maxEnding + arr[i],arr[i]);
            sum = Math.max(sum,maxEnding);
        }
        System.out.print("maxium sum of subarray is : "+ sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++) {
            System.out.print("Enter the value of index "+ i +" : ");
            arr[i] = sc.nextInt();
        }
        max(arr);
    sc.close();
    }
}
