class Cylinder extends Circle{

	private double height=1.0;

	public Cylinder(){

	}

	public Cylinder(double height){
		this.height=height;
	}

	public Cylinder(double radius, double height){
		super(radius);
		this.height=height;
	}

	public double getheight(){
		return height;
	}

	public void setheight(double height){
		this.height=height;
	}

	public double getvolume(){
		return getarea() *height;
	}
}
