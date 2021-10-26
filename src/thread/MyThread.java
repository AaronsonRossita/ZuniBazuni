package thread;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("MyThread is running");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThread is still running");

    }

}
