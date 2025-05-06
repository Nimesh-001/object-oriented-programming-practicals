public class Mythread extends Thread {
    public void run() {
       // super.run();
        for (int i = 0; i < 10; i++) {
            System.out.println("Numbers : "+i);
            
        }

        System.out.println(Thread.currentThread().getName());
    }
}
