public class Account2{

	int a,b;
	public void setdata(int a,int b){
		this.a=a;
		this.b=b;

	}

	public void showdata(){
		System.out.println("value of a is : "+a);
		System.out.println("value of b is : "+b);
	}

	public static void main(String args[]){
		Account2 acc2=new Account2();
		acc2.setdata(2,3);
		acc2.showdata();
	}
}
