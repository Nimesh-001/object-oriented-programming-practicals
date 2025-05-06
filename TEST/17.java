public class Demo {
    public static void main(String[] args) {

        //Printnumdemo printnumdemo = new Printnumdemo();
       // printnumdemo.printnumbers("first");
        //printnumdemo.printnumbers("second");


        //Printnumdemo printnumdemo2 = new Printnumdemo();
        //printnumdemo2.printnumbers("third");
       // printnumdemo2.printnumbers("fourth");

        Mythread mythread = new Mythread();//oblect creating....
        mythread.setName("firest ");
        mythread.start();//starting.............
        //mythread.run();

       // mythread.start();//cant stat same thread........run and seee....

        Mythread mythread2 = new Mythread();
        mythread2.setName("second ");
        mythread2.start();
        //mythread2.run();


    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Mythreadinter implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName()+"Numbers : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }



        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Demo {
    public static void main(String[] args) {

        //Printnumdemo printnumdemo = new Printnumdemo();
       // printnumdemo.printnumbers("first");
        //printnumdemo.printnumbers("second");


        //Printnumdemo printnumdemo2 = new Printnumdemo();
        //printnumdemo2.printnumbers("third");
       // printnumdemo2.printnumbers("fourth");

        //Mythread mythread = new Mythread();//oblect creating....
       // mythread.setName("firest ");
        //mythread.start();//starting.............
        //mythread.run();

       // mythread.start();//cant stat same thread........run and seee....

        //Mythread mythread2 = new Mythread();
        //mythread2.setName("second ");
       // mythread2.start();
        //mythread2.run();

        
        
        Mythreadinter mythreadinter = new Mythreadinter();//CREATE OBJECT WITH THREADING CAPABILITIES..
        Thread thread1 = new Thread(mythreadinter);//thread object creation
        thread1.start();

    }
}
