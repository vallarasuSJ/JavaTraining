package I_Exception;

public class I_Exception {
    public static void main(String[] args) {
        try{
            int a=12/0;
            System.out.println("Exception");
        }
        catch(Exception e){
            if(e instanceof ArithmeticException){
                System.out.println("Arithmetic Error");
            }
            else{
                System.out.println(e);
            }
        }
    }
}

class Test {
    void add() throws Exception{
        throw new Exception("Custom Exception");

    }

}
