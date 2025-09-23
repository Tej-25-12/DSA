class Solution {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter total Numbers you want in Input:");
        int count = Input.nextInt();
        int[] nums = inputArray(count);
        System.out.print("Enter a target value: ");
        int target = Input.nextInt();
        int[] result = new Solution().twoSum(nums, target);
        if (result != null) {
            System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No pair found that adds up to the target.");
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i=0;i<nums.length;i++) {
            for (int j=i+1;j<nums.length;j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
    public static int[] inputArray(int count) {
        Scanner Input = new Scanner(System.in);
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = Input.nextInt();
        }
        return arr;
    }
}