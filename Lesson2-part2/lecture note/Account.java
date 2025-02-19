public class Account{

	int a,b;
	public void setdata(int a,int b){
		a=a;
		b=b;

	}

	public void showdata(){
		System.out.println("value of a is : "+a);
		System.out.println("value of b is : "+b);
	}

	public static void main(String args[]){
		Account acc=new Account();
		acc.setdata(2,3);
		acc.showdata();
	}
}
