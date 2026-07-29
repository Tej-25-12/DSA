package array;

import java.util.*;

public class sum_avg {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0;i<size;i++) {
            System.out.print("Enter the value of index "+ i + " : ");
            arr[i]= sc.nextInt();
        }
        int sum =0;
        for (int i=0;i<arr.length;i++){
            sum+= arr[i];
        }
        System.out.println("Total sum: "+ sum);
        int avg = sum / size;
        System.out.println("Average of an array: "+ avg);
    }
}
