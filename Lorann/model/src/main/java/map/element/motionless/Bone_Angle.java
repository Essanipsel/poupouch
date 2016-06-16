package map.element.motionless;

import map.element.Permeability;
import map.element.Sprite;

public class Bone_Angle extends MotionlessElement {
	public Bone_Angle() {
		super(new Sprite("^^", "bone.jpg"), Permeability.BLOCKING, 'B');
	}

}
