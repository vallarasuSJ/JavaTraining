package Java_Tasks;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println("The prime numbers are:");
        for(int i=1;i<=100;i++){
            IsPrime prime = new IsPrime();
            boolean ans=prime.result(i);
            if(!ans){
                System.out.println(i);
            }
        }

    }
    public boolean result(int a){
        boolean flag=false;
        if(a==0 || a==1){
            return true;
        }
        for(int i=2;i<=a/2;i++){
            if(a%i==0){
                flag=true;
                break;
            }
        }
        return flag;

    }

}
