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
        //mythreadinter.start();//there no such method to invoke 
        Thread thread1 = new Thread(mythreadinter);//thread object creation
        thread1.start();

    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

****homework - important....***********

public class AddMul extends Thread {

    int result1=0;
    int result2=1;

    public void run() {
        for (int i = 1; i <= 100; i++) {
            result1 += i;
            System.out.println(result1);
        }

        System.out.println("finish......");


        for (int i=1; i<=100; i++) {
            result2 *= i;
            System.out.println(result2);
        }
        System.out.println("finish....");




    }
}


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

*********check this also. this class contain main metod for above,****************

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



       // Mythreadinter mythreadinter = new Mythreadinter();//CREATE OBJECT WITH THREADING CAPABILITIES..
        //mythreadinter.start();//there no such method to invoke
       // Thread thread1 = new Thread(mythreadinter);//thread object creation
      //  thread1.start();



        AddMul addMul = new AddMul();
        addMul.start();

    }
}
