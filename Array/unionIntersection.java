package array;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;

public class unionIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0; i<arr1.length; i++) {
            System.out.print("Enter the values of an array at index " + i + ": ");
            arr1[i] = sc.nextInt();
        }
        System.out.print("NOW, Enter the size of Second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n1];
        for(int i=0; i<arr2.length; i++) {
            System.out.print("Enter the values of an array at index " + i + ": ");
            arr2[i] = sc.nextInt();
        }
        System.out.println("First Array: "+Arrays.toString(arr1));
        System.out.println("Second Array: "+Arrays.toString(arr2));

        HashSet<Integer> union = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();
        for(int num: arr1) {
            union.add(num);
        }
        for(int num: arr2) {
            if(union.contains(num)) {
                intersection.add(num);
            }
            union.add(num);
        }
        System.out.println("Union: "+ union);
        System.out.println("Intersection: "+ intersection);
        sc.close();
    }
}
