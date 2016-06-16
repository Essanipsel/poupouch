package map.element.motionless;

import map.element.Permeability;
import map.element.Sprite;

public class BoneH extends MotionLessElement {
	public BoneH() {
		super(new Sprite("H", "land.jpg"), Permeability.PENETRABLE, 'C');
	}

}
