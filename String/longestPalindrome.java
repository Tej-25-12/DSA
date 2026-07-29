package string;

import java.util.Scanner;

public class longestPalindrome {
    public static String expand(String str,int left,int right) {
        while(left>=0 && right < str.length() && str.charAt(left)==str.charAt(right)) {
            left--;
            right++;
        }
        return str.substring(left+1,right);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        String longest = "";
        for (int i=0; i< str.length(); i++) {
            String odd = expand(str, i, i);
            String even = expand(str, i, i+1);
            if(odd.length() > longest.length()) {
                longest = odd;
            }
            if(even.length() > longest.length()) {
                longest = even;
            }
        }
        System.out.println("Longest Palindrome Substring: "+longest);
        sc.close();
    }
}
