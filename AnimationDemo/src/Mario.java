

import java.awt.*;
import java.util.*;

import processing.core.PImage;

public class Mario extends Sprite {

	public static final int MARIO_WIDTH = 40;
	public static final int MARIO_HEIGHT = 60;

	public Mario(PImage img, int x, int y) {
		super(img, x, y, MARIO_WIDTH, MARIO_HEIGHT);
	}

	// METHODS
	public void walk(int dir) {
		x+=dir;
	}

	public void jump() {
		y -= 10;
		//vaibhav, if you get this message, let me know!!!!!!!!!!!!1
	}

	public void act(ArrayList<Shape> obstacles) {
		for (Shape s : obstacles) {
			// Hi
		}
	}


}
