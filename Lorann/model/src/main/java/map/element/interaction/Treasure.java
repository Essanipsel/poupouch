package map.element.interaction;

import map.element.Sprite;

public class Treasure extends Interaction {
	public Treasure() {
		super(new Sprite("┌┐", "door.jpg"), ActionOnHeroes.PICK_UP, 'd');
	}

}