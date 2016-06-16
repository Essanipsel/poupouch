package map.element.motionless;

import contract.ActionOnHeroes;
import map.element.Permeability;
import map.element.Sprite;

public class Bone_H extends MotionlessElement {
	public Bone_H() {
		super(new Sprite("--", "boneh.jpg"), Permeability.BLOCKING, 'V');
	}

	@Override
	public ActionOnHeroes getActionOnHeroes() {
		// TODO Auto-generated method stub
		return null;
	}

}
