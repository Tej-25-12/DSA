package string;

import java.util.Scanner;
import java.util.HashSet;

public class longestStrWithoutCharRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int max =0;
        for(int i=0; i<str.length(); i++) {
            HashSet<Character> set = new HashSet<>();
            for(int j=i; j<str.length(); j++) {
                if(set.contains(str.charAt(j))) {
                    break;
                }
                set.add(str.charAt(j));
                max = Math.max(max, j-i+1);
            }
        }
        System.out.println("Longest Length: "+ max);
        sc.close();
    }
}

