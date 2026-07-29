package string;

import java.util.Scanner;

public class charFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        for(int i=0; i<str.length(); i++) {
            int count =1;
            char ch = str.charAt(i);
            if (str.indexOf(ch) != i) {
                continue;
            }
            for(int j=i+1; j<str.length(); j++) {
                if(ch == str.charAt(j)) {
                    count++;
                }
            }
            System.out.println(ch + "=" + count);
        }
    sc.close();
    }
}
