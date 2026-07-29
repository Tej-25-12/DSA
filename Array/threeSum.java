package array;

import java.util.Arrays;
import java.util.Scanner;

public class threeSum {
    public static void findThreeSum(int[] nums, int target) {
        Arrays.sort(nums);
        System.out.println("Sorted array: " + Arrays.toString(nums));
        boolean found = false;
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) {
                    System.out.println(
                            "Indices: " + i + ", " + left + ", " + right
                    );
                    System.out.println(
                            "Triplet: " + nums[i] + ", " +
                                    nums[left] + ", " + nums[right]
                    );
                    found = true;
                    left++;
                    right--;
                }
                else if (sum < target) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        if (!found) {
            System.out.println("No triplet found");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter value at index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        findThreeSum(arr, target);
        sc.close();
    }
}