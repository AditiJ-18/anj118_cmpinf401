// INFSCI0017 Lab 6 - Created by Dr. John Ramirez
// Fill in the indicated code sections to complete this class.  Then test it
// by compiling and executing Lab6.java.

public class MyRectangle{
	// Declare instance variables here. See toString() method below for names.
	private int startX; 
	private int startY; 
	private int width;  
	private int height; 

	public MyRectangle(){
		// Default constructor -- initialize all instance variables to 0
		startX = 0; 
		startY = 0; 
		width = 0; 
		height = 0; 
	}

	public MyRectangle(int x, int y, int w, int h){
		// Initialize instance variables based on parameters shown.
		// Be careful to get the order correct!
		this.startX = x; 
		this.startY = y; 
		this.width = w; 
		this.height = h; 
	}

	public int area(){
		// Return the area of this Rectangle
		int area = width * height; 
		return area; 
	}

	// I have written this method for you.  Note how a StringBuilder is
	// utilized, since (as we discussed in lecture) it can be modified
	// without having to create a new object each time (unlike a String).
	public String toString(){
		StringBuilder S = new StringBuilder();
		S.append("Width: " + width);
		S.append(" Height: " + height);
		S.append(" X: " + startX);
		S.append(" Y: " + startY);
		return S.toString();
	}

	public boolean isInside(int x, int y){
		// This is the trickiest of the methods to write.  This should
		// return true if point (x,y) is anywhere within the borders of the
		// current MyRectangle (including the borders themselves).  Use a
		// pencil and paper to figure out how this can be determined with
		// just a few simple relational operations.

		// find coordinates of each corner and see if the point coordinates 
		// fall in between any of them 
		boolean inside = false; 
		if ((x >= startX && x <= width + startX) && (y >= startY && y <= height + startY)) { 
			inside = true; 
		}
		return inside; 		
	}

	public void setSize(int w, int h){
		// Update width and height as shown
		this.width = w; 
		this.height = h; 
	}

	public void setPosition(int x, int y){
		// Update startX and startY as shown
		this.startX = x; 
		this.startY = y; 
	}

}