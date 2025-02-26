class Circle{

	private double radius=1.0;

	public Circle(){
	}
	
	public Circle(double radius){
		this.radius=radius;
	}

	public double getradius(){
		return radius;
	}

	public void setradius(double radius){
		this.radius=radius;
	}

	public double getarea(){
		return Math.PI*radius*radius;
	}
}
