package array;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static void findTwoSum(int[]nums,int target) {
        Map<Integer,Integer> map = new HashMap<>();
        boolean found = false;
        for(int i=0;i<nums.length;i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                System.out.println("Indices are: "+map.get(complement)+" , "+i);
                found = true;
            }
            map.put(nums[i], i);
        }
        if(!found) {
            System.out.println("No Pair Found!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++) {
            System.out.print("Enter value of index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        findTwoSum(arr, target);
        sc.close();
    }
}


