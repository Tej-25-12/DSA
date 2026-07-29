package string;

import java.util.Scanner;
public class FIrstNonRepeatedChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        for(int i=0; i< str.length(); i++) {
            char ch = str.charAt(i);
//            if (ch == ' ') {
//                continue;
//            }
            if(str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First non repeated character in a string is: "+ ch);
                break;
            }
        }
        sc.close();
    }
}
