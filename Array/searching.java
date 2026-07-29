package array;

import java.util.Scanner;

public class searching {
    public static int search(int key,int arr[]){
        for(int i=0;i < arr.length; i++){
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter value of index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter a number that you want to search: ");
        int key = sc.nextInt();
        int position = search(key, arr);
        if (position ==-1){
            System.out.println("Element not Found! ");
        } else {
            System.out.print("Key is found in given array at index "+ position);
        }
    }
}
