

import java.awt.*;
import java.awt.geom.Rectangle2D;
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
	
		x += 5*dir;
	}

	public void jump() {
		y -= 10;
		//vaibhav, if you get this message, let me know!!!!!!!!!!!!1
	}

	public void act(ArrayList<Shape> obstacles) {
		this.moveByAmount(0, 5);
		for (Shape s : obstacles) {
			if (this.intersects((Rectangle2D) s)) {
				this.moveByAmount(0, -5);
			}
		}
	}


}
