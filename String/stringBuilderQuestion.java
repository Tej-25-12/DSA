//Write a Java program using StringBuilder to:
//
//        Take a string
//        Reverse it
//        Replace all vowels with *
//        Append " DONE !" at the end

package string;

import java.util.Scanner;

public class stringBuilderQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        for(int i=0; i< str.length(); i++) {
            char ch = Character.toLowerCase(sb.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                sb.setCharAt(i, '*');
            }
        }
        sb.append(" DONE !");
        System.out.println("Final String: "+ sb);
        sc.close();
    }
}
