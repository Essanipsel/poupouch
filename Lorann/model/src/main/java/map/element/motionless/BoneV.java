package map.element.motionless;

import map.element.Permeability;
import map.element.Sprite;

public class BoneV extends MotionLessElement {
	public BoneV() {
		super(new Sprite("V", "land.jpg"), Permeability.PENETRABLE, 'C');
	}

}
