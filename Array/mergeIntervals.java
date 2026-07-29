package array;

import java.util.Scanner;
import java.util.Arrays;

public class mergeIntervals {
    public static void merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        for (int[] interval : intervals) {
            System.out.println(Arrays.toString(interval));
        }

        int start = intervals[0][0];
        int end = intervals[0][1];

        System.out.println("\nMerged Intervals:");
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } else {
                System.out.println("[" + start + ", " + end + "]");
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        System.out.println("[" + start + ", " + end + "]");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of intervals: ");
        int n = sc.nextInt();
        int[][] intervals = new int[n][2];
        System.out.println("Enter intervals:");
        for (int i = 0; i < n; i++) {
            System.out.print("Start of interval " + (i + 1) + ": ");
            intervals[i][0] = sc.nextInt();
            System.out.print("End of interval " + (i + 1) + ": ");
            intervals[i][1] = sc.nextInt();
        }
        merge(intervals);
        sc.close();
    }
}
