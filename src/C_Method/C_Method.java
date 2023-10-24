package C_Method;

public class C_Method {

    void method(){
        System.out.println("This is method");
    }

    void method(String message){
        System.out.println(message);
    }

    static int add(){
        return 10+15;
    }
    public static void main(String[] args) {


        C_Method objectOne= new C_Method();

        objectOne.method();
        objectOne.method("Hello Java");
        System.out.println(C_Method.add());

    }
}
