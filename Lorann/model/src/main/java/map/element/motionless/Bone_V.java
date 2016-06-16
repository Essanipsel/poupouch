package map.element.motionless;

import contract.ActionOnHeroes;
import map.element.Permeability;
import map.element.Sprite;

public class Bone_V extends MotionlessElement {
	public Bone_V() {
		super(new Sprite("--", "bonev.png"), Permeability.BLOCKING, 'V');
	}

	@Override
	public ActionOnHeroes getActionOnHeroes() {
		// TODO Auto-generated method stub
		return null;
	}

}
