package Java_Tasks;

import java.util.Scanner;

public class Substring {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter the substring : ");
        String subStr = sc.next();
        int subLength = subStr.length();
        int index = 0;
        int count = 0;
        Substring obj = new Substring();
        int length = str.length();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == subStr.charAt(0)) {
                String value = str.substring(i, length);
                boolean result = obj.ans(value, subStr);
                if (result) {
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }

    public boolean ans(String str, String sub) {
        int index = 0;
        if (str.indexOf(sub, index) >= 0) {
            return true;

        }
        else{
            return false;
        }
    }


}
