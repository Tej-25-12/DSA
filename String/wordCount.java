package string;

import java.util.Scanner;

public class wordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        str = str.trim();
        int count = 0;
        if(! str.isEmpty()) {
            count =1;
            for(int i=0; i<str.length(); i++) {
                if(str.charAt(i) == ' ' && str.charAt(i+1) !=' ') {
                    count++;
                }
            }
        }
        System.out.println("Number of words: " + count);
        sc.close();
    }
}
