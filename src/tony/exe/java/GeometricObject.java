package tony.exe.java;

public class GeometricObject {
	protected String color;
	protected double weight;
	
	protected GeometricObject(){
		super();
		this.color = "white";
		this.weight = 1.0;
	}
	
	protected GeometricObject(String color, double weight){
		super();
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}
