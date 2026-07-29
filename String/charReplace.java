package string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter character to replace: ");
        char oldChar = sc.next().charAt(0);
        System.out.print("Enter new character: ");
        char newChar = sc.next().charAt(0);
        String result = str.replace(oldChar, newChar);

        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + result);
        sc.close();
    }
}