package map.element.interactions;

import contract.ActionOnHeroes;
import map.element.ISprite;
import map.element.Permeability;
import map.element.Sprite;

public class Treasure extends Interactions{

	public Treasure(ISprite sprite, Permeability permeability, char fileSymbol,ActionOnHeroes action) {
		super(new Sprite("$$", "treasure.jpg"), Permeability.PENETRABLE, 'T',ActionOnHeroes.PICK_UP);
		// TODO Auto-generated constructor stub
	}

	
}
