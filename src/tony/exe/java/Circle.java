package tony.exe.java;

public class Circle extends GeometricObject {
	private double radius;
	
	public Circle(){
		super();
		this.radius = 1.0;
	}
	
	public Circle(double radius){
		super();
		this.radius = radius;
	}
	
	public Circle(double radius, String color, double weight){
		super(color,weight);
		this.radius = radius;
	}
	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double findArea(){
		return Math.PI * this.radius*this.radius;
	}
	public boolean equals(Object c){
		
	 if(this == c){
			return true;
		} else if(c instanceof Circle)  {
			Circle c1 = (Circle)c;
			return this.radius == c1.radius;
		} else {
			return false;
		}
	}
	
	public String toString(){
		return "Its radius is: " + this.radius;
	}
	
}
