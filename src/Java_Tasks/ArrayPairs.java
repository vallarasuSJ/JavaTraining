package Java_Tasks;

import java.util.Scanner;

public class ArrayPairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        System.out.println("Enter array numbers: ");
        int array[]=new int[100];
        for (int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the K value");
        int k=sc.nextInt();

//        int array[]={-5,1,-40,20,6,8,7};
//        int k=15;
        boolean flag=false;
        for(int i=0;i< array.length-1;i++){
            for(int j=i+1;j< array.length;j++){
                if(array[i]+array[j]==k){
                    flag=true;
                    break;
                }
            }
        }
        if(flag==true){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }

}
