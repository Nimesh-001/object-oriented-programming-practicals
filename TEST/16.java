public class Printnumdemo {

    public void printnumbers(String call){
        //int i=1;

        for(int i = 1; i <= 10; i++){
            System.out.println(call+"Number : "+i);

        }

        System.out.println(Thread.currentThread().getName());
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

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
}
