package map.element.interactions;


import contract.ActionOnHeroes;
import map.element.Element;
import map.element.ISprite;
import map.element.Permeability;



public abstract class Interactions extends Element {

	public Interactions(ISprite sprite, Permeability permeability, char fileSymbol,ActionOnHeroes action) {
		super(sprite, permeability, fileSymbol,action);
		// TODO Auto-generated constructor stub
	}
	public Interactions(ISprite sprite, Permeability permeability, char fileSymbol,ActionOnHeroes action, ActionOnHeroes action2) {
		super(sprite, permeability, fileSymbol,action,action2);
		
		// TODO Auto-generated constructor stub
	}

	

}
