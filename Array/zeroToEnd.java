package array;

import java.util.Scanner;
import java.util.Arrays;

public class zeroToEnd {
    public static void pushZero(int[] arr) {
        int[] temp = new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] != 0) {
                temp[j++]= arr[i];
            }
        }
        while(j<arr.length) {
            temp[j++]= 0;
        }
        System.out.println(Arrays.toString(temp));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0; i<size;i++) {
            System.out.print("Enter the value of an index "+ i + ": ");
            arr[i]=sc.nextInt();
        }
        pushZero(arr);
        sc.close();
    }
}
