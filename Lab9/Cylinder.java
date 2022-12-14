public class Cylinder extends Circle {

	private double height = 1.0; 
	
	public Cylinder() {	}

	public Cylinder(double radius, double height) { 
		super(radius); 
		this.height = height; 
	}
	
	public Cylinder(double radius, double height, String color) { 
		super(radius, color); 
		this.height = height; 	
	}
	
	public double getHeight() { 
		return height; 
	}
	
	public void setHeight(double height) { 
		this.height = height; 
	}
	
	public double getVolume() { 
		double volume = getArea() * height; 
		return volume; 
	}
	
	/* used to test code
	public String toString() {
		String cylinder = "Radius: " + getRadius() + '\n' + "Color: " + getColor() + '\n' + "Height: " + getHeight() + '\n' + "Volume: " + getVolume(); 
		return cylinder; 
	} */ 
}