package map.element.motionless;

import map.element.ISprite;
import map.element.Permeability;
import map.element.Sprite;
import map.element.interactions.ActionOnHeroes;
import map.element.interactions.Interactions;

public class DoorClosed extends MotionlessElement{

	public DoorClosed(ISprite sprite, Permeability permeability, char fileSymbol, ActionOnHeroes action) {
		super(new Sprite("()", "doorclosed.jpg"), Permeability.PENETRABLE, 'C', ActionOnHeroes.PICKUP);
		
		
		
		
	}

	
		

}
