package Java_Tasks;

import java.util.Scanner;

public class IsVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        String str1="";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'U' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O') {
                continue;
            }
            else{
                str1+=str.charAt(i);
            }
        }
        System.out.println("Result: " + str1);
    }
}
