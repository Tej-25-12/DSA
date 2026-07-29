package string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String[] words = str.trim().split("\\s+");
        int wordCount = (str.trim().isEmpty()) ? 0 : words.length;
        System.out.println("Word Count = " + wordCount);

        sc.close();
    }
}