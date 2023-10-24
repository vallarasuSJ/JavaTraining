package A_Object;


import javax.lang.model.element.Name;

public class A_Object extends Specifiers {
    String firstName = "vallarasu";


    //protected - parent class can access method directly from child class without creating an object
    public void check(){
        Name();
    }

    public static void main(String[] args) {
//   object can be created either for the same class or outside class.
//   whenever the object is created new memory is allocated for the object.
        A_Object objectOne = new A_Object();
        System.out.println(objectOne);
        System.out.println(objectOne.firstName);


        A_Object objectTwo = new A_Object();
        System.out.println(objectTwo);
        System.out.println(objectTwo.firstName);

        Specifiers objectThree = new Specifiers();
        System.out.println(objectThree);
        objectThree.Name();

    }
}

