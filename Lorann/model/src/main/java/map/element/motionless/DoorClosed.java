package map.element.motionless;

import map.element.Permeability;
import map.element.Sprite;
import map.element.interaction.ActionOnHeroes;

public class DoorClosed extends MotionLessElement {
	public DoorClosed() {
		super(new Sprite("┌┐", "door.jpg"), Permeability.BLOCKING, ActionOnHeroes.NO_ENTER, 'd');
	}

}
