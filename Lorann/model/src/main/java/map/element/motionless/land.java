package map.element.motionless;

import map.element.Permeability;
import map.element.Sprite;

public class Land extends MotionlessElement {
	public Land() {
		super(new Sprite("░░", "land.jpg"), Permeability.PENETRABLE, ' ');
	}

}
