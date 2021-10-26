package thread;

public class ThreadRunner {

    public static void main(String[] args) throws InterruptedException {

//        System.out.println(Thread.activeCount());
//        System.out.println(Thread.currentThread().getName());
//        Thread.currentThread().setName("thready thread");
//        System.out.println(Thread.currentThread().getName());

//        System.out.println(Thread.currentThread().getPriority());
//        Thread.currentThread().setPriority(6);
//        System.out.println(Thread.currentThread().getPriority());

//        System.out.println(Thread.currentThread().isAlive());

//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//            Thread.sleep(1000);
//        }

        MyThread myThread = new MyThread();

//        System.out.println(Thread.activeCount());
//        System.out.println(myThread.isAlive());

        myThread.start();

//        System.out.println(Thread.activeCount());
//        System.out.println(myThread.isAlive());


//        myThread.setName("My new thread");
//        System.out.println(myThread.getName());
//
//        System.out.println(Thread.currentThread().getPriority());
//        System.out.println("MyThread priority is = " + myThread.getPriority());

        System.out.println(myThread.isDaemon());
        Thread.sleep(5000);
        myThread.setDaemon(true);
        System.out.println("is myThread deamon now = " + myThread.isDaemon());

    }

}
