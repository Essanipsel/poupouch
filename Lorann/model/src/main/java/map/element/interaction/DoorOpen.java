package map.element.interaction;

import map.element.Sprite;

public class DoorOpen extends Interaction {
	public DoorOpen() {
		super(new Sprite("┌┐", "door.jpg"), ActionOnHeroes.ENTER, 'd');
	}

}