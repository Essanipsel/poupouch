package map.element.motionless;

import map.element.Permeability;
import map.element.Sprite;

public class BoneAngle extends MotionLessElement {
	public BoneAngle() {
		super(new Sprite("O", "land.jpg"), Permeability.PENETRABLE, 'C');
	}

}
