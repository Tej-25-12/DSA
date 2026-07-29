package string;

import java.util.Scanner;

public class stringPermutation {
    public static void permutation(String str,String ans) {
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) +str.substring(i+1);
            permutation(ros,ans+ch);        //recursive call
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        permutation(str,"");
        sc.close();
    }
}
