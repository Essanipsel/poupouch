package map.element.motionless;

import map.element.Permeability;
import map.element.Sprite;

public class land extends MotionLessElement {
	public land() {
		super(new Sprite(" ", "land.jpg"), Permeability.PENETRABLE, 'C');
	}

}
