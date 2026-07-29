package string;

import java.util.Scanner;

public class charReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        str = str.replace(" ","_");
        System.out.println("New String: "+ str);
        sc.close();
    }
}
