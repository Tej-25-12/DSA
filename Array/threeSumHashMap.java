package array;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class threeSumHashMap {
    public static void findThreeSum(int[] nums, int target) {
        boolean found = false;
        for(int i = 0; i < nums.length - 2; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            int currentTarget = target - nums[i];
            for(int j = i + 1; j < nums.length; j++) {
                int complement = currentTarget - nums[j];
                if(map.containsKey(complement)) {
                    System.out.println("Triplet found at indices: "+i+ " , "
                            +map.get(complement) + " , "+ j
                    );
                    System.out.println(
                            "Values are: "+ nums[i] + " + "+ complement + " + "
                                    + nums[j] + " = "+ target
                    );
                    found = true;
                }
                map.put(nums[j], j);
            }
        }
        if(!found) {
            System.out.println("No triplet found");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.print("Enter value at index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        findThreeSum(arr, target);
        sc.close();
    }
}