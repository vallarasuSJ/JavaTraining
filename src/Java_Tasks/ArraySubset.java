package Java_Tasks;

import java.util.Scanner;

public class ArraySubset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array1 size: ");
        int a=sc.nextInt();
        int arr1[]=new int[100];
        System.out.println("Enter the Array1 : ");
        for(int i=0;i<a;i++){
            arr1[i]=sc.nextInt();
        }


        System.out.println("Enter the Array2 size: ");
        int b=sc.nextInt();
        int arr2[]=new int[100];
        System.out.println("Enter the Array1 : ");
        for(int i=0;i<b;i++){
            arr2[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<b;i++){
            for(int j=0;j<a;j++){
                if(arr2[i]==arr1[j]){
                    count+=1;
                    break;
                }
            }
        }

        if(count==b){
            System.out.println("True");
        }
        else{
            System.out.println("False");

        }


    }
}
