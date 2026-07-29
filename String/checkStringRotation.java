package string;

import java.util.Scanner;

public class checkStringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str = sc.nextLine();
        System.out.print("Enter second string: ");
        String str1 = sc.nextLine();
        str = str.toLowerCase();
        str1 = str1.toLowerCase();
        String temp = str + str;
        if (temp.contains(str1)) {
            System.out.println("String rotation is present.");
        } else {
            System.out.println("String roatation is not present.");
        }
        sc.close();
    }
}
