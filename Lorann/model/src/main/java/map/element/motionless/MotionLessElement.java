package map.element.motionless;

import map.element.Element;
import map.element.ISprite;
import map.element.Permeability;
import map.element.interaction.ActionOnHeroes;


public abstract class MotionLessElement extends Element {
	private final char fileSymbol;

	public MotionLessElement(final ISprite sprite, final Permeability permeability, final char fileSymbol) {
		super(sprite, permeability);
		this.fileSymbol = fileSymbol;
	}
	
	public MotionLessElement(final ISprite sprite, final ActionOnHeroes actionOnHeroes, final char fileSymbol) {
		super(sprite, actionOnHeroes);
		this.fileSymbol = fileSymbol;
	}

	public char getFileSymbol() {
		return this.fileSymbol;
	}

}
