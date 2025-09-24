class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = input.nextInt();
        Solution solution = new Solution();
        boolean result =solution.isPalindrome(x);
        System.out.println("Is Given String a palindrome? : "+ result);
    }
    public boolean isPalindrome(int x) {
        int original = x;
        int rev = 0;
        if (x < 0) {
            return false;
        }
        while(x != 0) {
            int num = x%10;
            rev=rev*10+num;
            x/=10;
        }
        return original == rev;
    }
}