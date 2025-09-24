class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = input.nextInt();
        Solution solution = new Solution();
        int output = solution.mySqrt(x);
        System.out.println("The square root of "+ x + " is "+ output);
    }
    public int mySqrt(int x) {
        if(x < 2) {
            return x;
        }
        int left =1;
        int right =x;
        int ans =0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long midSquared = (long) mid * mid;
            if (midSquared == x) {
                return mid;
            }else if (midSquared < x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}