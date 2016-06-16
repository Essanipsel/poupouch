package map.element.interaction;

import map.element.Element;
import map.element.ISprite;

public class Interaction extends Element {
	private final char fileSymbol;

	public Interaction(final ISprite sprite, final ActionOnHeroes actionOnHeroes, final char fileSymbol) {
		super(sprite, actionOnHeroes);
		this.fileSymbol = fileSymbol;
	}

	public char getFileSymbol() {
		return this.fileSymbol;
	}
}
