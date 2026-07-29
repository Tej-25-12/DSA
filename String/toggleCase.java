package string;

import java.util.Scanner;

public class toggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String result = "";
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            }  else {
                result += Character.toUpperCase(ch);
            }
        }
        System.out.println("New Toggled String: "+ result);
        sc.close();
    }
}
