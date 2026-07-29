import java.util.*;

public class secondlargestnum_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }
        int[] arr = new int[n];
        for( int i=0;i < n; i++) {
            System.out.print("Enter the value of index "+ i + ": ");
            arr[i] = sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest distinct element found.");
        } else {
            System.out.println("The second largest number is: " + secondLargest);
        }
        sc.close();
    }
}