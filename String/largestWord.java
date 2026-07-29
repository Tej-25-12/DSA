package string;

import java.util.Scanner;

public class largestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        String largest = words[0];
        for(String word : words) {
            if(word.length() > largest.length()) {
                largest =word;
            }
        }
        System.out.print("Largest word: "+ largest);
        sc.close();
    }
}
