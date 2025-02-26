public class Demo{

	public static void main(String args[]){
		Cylinder c1= new Cylinder();
		Cylinder c2 = new Cylinder(10.0);
		Cylinder c3= new Cylinder(7.0, 10.0);

		System.out.print("c1 -> radius:"+c1.getradius()+" ");
		System.out.print("height:"+c1.getheight()+" ");
		System.out.print("base area:"+c1.getarea()+" ");
		System.out.print("volume:"+c1.getvolume());
		System.out.println();

		System.out.print("c2 -> radius:"+c2.getradius()+" ");
		System.out.print("height:"+c2.getheight()+" ");
		System.out.print("base area:"+c2.getarea()+" ");
		System.out.print("volume:"+c2.getvolume());
		System.out.println();

		System.out.print("c3 -> radius:"+c3.getradius()+" ");
		System.out.print("height:"+c3.getheight()+" ");
		System.out.print("base area:"+c3.getarea()+" ");
		System.out.print("volume:"+c3.getvolume());
		System.out.println();
	}
}
