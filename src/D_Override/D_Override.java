package D_Override;

public class D_Override {

    public static void main(String[] args) {
        Vehicle vehicle= new Vehicle(20);
        vehicle.getColor();
        vehicle.getWheels();

        //single level inheritance
        Car car = new Car();
        car.getColor();
        //encapsulation.
        car.getWheels();

        //multilevel inheritance
        Bike bike= new Bike();
        bike.getColor();
        bike.getWheels();
        bike.getBikeName();

        //unboxing - wrapper class to primitive data types
        Integer numA=5;
        int a=numA;
        System.out.println(a);

        //Casting - convert the data types
        float numFloat=1.4f;
        int intA=(int)numFloat;
        System.out.println(intA);

    }
}
