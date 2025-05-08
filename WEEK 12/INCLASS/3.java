public class singleton {


    //create single object(eager initialization...)
    private  static singleton s =new singleton();


    //make constructor private.. so outsiders cannot make instamces,
    private singleton() {
    }

    //globle accesspoint
    public  static singleton getInstance() {
        return s;
    }

    public void printmsg(){

        System.out.println("hello from sigleton");
    }
}
