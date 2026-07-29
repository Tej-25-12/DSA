package string;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        String rev = "";
        for(int i=str.length()-1; i>=0;i--) {
            rev += str.charAt(i);
        }
        if(str.equalsIgnoreCase(rev)) {
            System.out.println("String is Palindrome!");
        } else {
            System.out.println("String is not Palindrome!");
        }
        sc.close();
    }
}
