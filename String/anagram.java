package string;

import java.util.Scanner;
import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First String: ");
        String str1 = sc.nextLine();
        System.out.print("Enter Second String: ");
        String str2 = sc.nextLine();

        char[] A = str1.toCharArray();
        char[] B = str2.toCharArray();

        Arrays.sort(A);
        Arrays.sort(B);

        if(Arrays.equals(A,B)) {
            System.out.print("Anagram");
        } else {
            System.out.print("Not Anagram");
        }
        sc.close();
    }
}
