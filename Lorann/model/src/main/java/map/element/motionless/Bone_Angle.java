package map.element.motionless;

import contract.ActionOnHeroes;
import map.element.Permeability;
import map.element.Sprite;

public class Bone_Angle extends MotionlessElement {
	public Bone_Angle() {
		super(new Sprite("^^", "bone.png"), Permeability.BLOCKING, 'B');
	}

	@Override
	public ActionOnHeroes getActionOnHeroes() {
		// TODO Auto-generated method stub
		return null;
	}

}
