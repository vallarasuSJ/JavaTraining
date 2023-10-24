package G_Thread;

public class G_Thread extends Thread {
    public void run(){
        System.out.println("Run bro!!");

    }
    public static void main(String[] args) {
        G_Thread g_thread=new G_Thread();
        g_thread.start();

    }
}
