package D_Override;

public class Vehicle {

    public Vehicle(){
        System.out.println("Default Constructor");
    }

    public Vehicle(int a){
        int s=100;
        System.out.println("Constructor overloading "+ s);
    }
    private int wheels=5;

    void getColor(){
        System.out.println("Parent - Green");
    }

     void getWheels(){
         System.out.println("wheels- " + wheels);
     }
}
