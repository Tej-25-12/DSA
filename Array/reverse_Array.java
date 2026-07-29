package array;

import java.util.*;

public class reverse_Array {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0;i < size;i++) {
            System.out.print("Enter value of index "+ i + ": ");
            arr[i] = sc.nextInt();
        }
        int start = 0,end = size-1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reversed array: "+ Arrays.toString(arr));
    }
}
