package map.element.motionless;

import contract.ActionOnHeroes;
import map.element.Element;
import map.element.ISprite;
import map.element.Permeability;

public abstract class MotionlessElement extends Element  {
	private final char fileSymbol;

	public MotionlessElement(final ISprite sprite, final Permeability permeability, final char fileSymbol) {
		super(sprite, permeability);
		this.fileSymbol = fileSymbol;
	}
	
	public MotionlessElement(final ISprite sprite, final Permeability permeability, final char fileSymbol, final ActionOnHeroes action) {
		super(sprite, permeability, action);
		this.fileSymbol = fileSymbol;
	}
	
	public char getFileSymbol() {
		return this.fileSymbol;
	}

	
}


