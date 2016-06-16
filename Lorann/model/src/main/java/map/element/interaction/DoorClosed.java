package map.element.interaction;

import map.element.Sprite;

public class DoorClosed extends Interaction {
	public DoorClosed() {
		super(new Sprite("┌┐", "door.jpg"), ActionOnHeroes.NO_ENTER, 'd');
	}

}
