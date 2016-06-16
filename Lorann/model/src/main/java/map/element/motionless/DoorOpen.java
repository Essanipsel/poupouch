package map.element.motionless;

import map.element.ISprite;
import map.element.Permeability;
import map.element.Sprite;
import map.element.interactions.ActionOnHeroes;
import map.element.interactions.Interactions;

public class DoorOpen extends MotionlessElement {

	public DoorOpen(ISprite sprite, Permeability permeability, char fileSymbol, ActionOnHeroes action) {
		super(new Sprite("éé", "dooropen.jpg"), Permeability.PENETRABLE, 'O');
		// TODO Auto-generated constructor stub
	}

	@Override
	public contract.ActionOnHeroes getActionOnHeroes() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
