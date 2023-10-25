package Java_Tasks;

import java.util.Scanner;

public class OccurenceOfChar {
    public static void main(String[] args) {
        System.out.println("Enter the string : ");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println("Enter the Character : ");
        char ch=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i)){
                count+=1;
            }
        }
        System.out.println("Total no. of occurence of " + ch + " is " + count);
    }
}
