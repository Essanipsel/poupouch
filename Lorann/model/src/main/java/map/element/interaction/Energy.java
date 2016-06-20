package map.element.interaction;

import map.element.Sprite;

public class Energy extends Interaction {
	public Energy() {
		super(new Sprite("┌┐", "door.jpg"), ActionOnHeroes.PICK_UP, 'd');
	}

}