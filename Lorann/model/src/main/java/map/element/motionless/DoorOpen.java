package map.element.motionless;

import map.element.Permeability;
import map.element.Sprite;
import map.element.interaction.ActionOnHeroes;

public class DoorOpen extends MotionLessElement {
	public DoorOpen() {
		super(new Sprite("┌┐", "door.jpg"), Permeability.BLOCKING, ActionOnHeroes.NO_ENTER, 'd');
	}

}