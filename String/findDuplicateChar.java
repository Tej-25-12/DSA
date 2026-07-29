package string;

import java.util.Scanner;

public class findDuplicateChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        System.out.println("Duplicate Characters: ");
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            int count =0;
            for (int j=0; j<str.length(); j++) {
                if(ch == str.charAt(j)) {
                    count++;
                }
            }
            if (count > 1 && str.indexOf(ch) == i) {
                System.out.println(ch);
            }
        }
        sc.close();
    }
}
