package map.element.interactions;

import map.element.ISprite;
import map.element.Permeability;
import map.element.Sprite;

public class Energy extends Interactions{

	public Energy(ISprite sprite, Permeability permeability, char fileSymbol, ActionOnHeroes action) {
		super(new Sprite("", "energy.jpg"), Permeability.PENETRABLE, 'E',ActionOnHeroes.PICKUP);
		// TODO Auto-generated constructor stub
	}

	

}
