import processing.core.PApplet;

public class DrawingSurface extends PApplet {

	// FIELDS
	
	
	public DrawingSurface() {
		
		
		runSketch();
	}
	
	
	
	// The statements in the setup() function 
	// execute once when the program begins
	public void setup() {

	}


	// The statements in draw() are executed until the 
	// program is stopped. Each statement is executed in 
	// sequence and after the last line is read, the first 
	// line is executed again.
	public void draw() {

		background(255);   // Clear the screen with a white background
		stroke(0);     // Set line drawing color to white
		noFill();

		float xRatio = width/400f;
		float yRatio = height/300f;
		scale(xRatio,yRatio);

		// Draw stuff

	} 
	
}
