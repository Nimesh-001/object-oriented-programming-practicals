public class Mythread extends Thread {
    public void run() {
       // super.run();
        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName()+"Numbers : "+i);
           try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }



        }

        //System.out.println(Thread.currentThread().getName());
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Demo {
    public static void main(String[] args) {

        //Printnumdemo printnumdemo = new Printnumdemo();
       // printnumdemo.printnumbers("first");
        //printnumdemo.printnumbers("second");


        //Printnumdemo printnumdemo2 = new Printnumdemo();
        //printnumdemo2.printnumbers("third");
       // printnumdemo2.printnumbers("fourth");

        Mythread mythread = new Mythread();//oblect creating....
        mythread.start();//starting.............
       // mythread.start();//cant stat same thread........run and seee....

        Mythread mythread2 = new Mythread();
        mythread2.start();


    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


public class Demo {
    public static void main(String[] args) {

        //Printnumdemo printnumdemo = new Printnumdemo();
       // printnumdemo.printnumbers("first");
        //printnumdemo.printnumbers("second");


        //Printnumdemo printnumdemo2 = new Printnumdemo();
        //printnumdemo2.printnumbers("third");
       // printnumdemo2.printnumbers("fourth");

        Mythread mythread = new Mythread();//oblect creating....
        mythread.start();//starting.............
        mythread.setName("firest ");
       // mythread.start();//cant stat same thread........run and seee....

        Mythread mythread2 = new Mythread();
        mythread2.setName("second ");
        mythread2.start();


    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



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

       // mythread.start();//cant stat same thread........run and seee....

        Mythread mythread2 = new Mythread();
        mythread2.setName("second ");
        mythread2.start();


    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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
       // mythread.start();//starting.............
        mythread.run();

       // mythread.start();//cant stat same thread........run and seee....

        Mythread mythread2 = new Mythread();
        mythread2.setName("second ");
        //mythread2.start();
        mythread2.run();


    }
}  //if we use run method instead of start, it break the mutiplisity of the programme,

