package Java_Tasks;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.next();
        int length=str.length();
        String str1="";
        int a=0;
        for(int i=length-1;i>=0;i--){
            str1+=str.charAt(i);
        }
        if(str1.equals(str)){
            System.out.println("The given string is palindrome");
        }
        else{
            System.out.println("The given string is not palindrome ");
        }
    }

}
