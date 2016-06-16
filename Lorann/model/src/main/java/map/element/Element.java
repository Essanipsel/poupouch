package map.element;

import java.awt.Image;

import aedt.showboard.ISquare;
import contract.IMap;
import map.element.interaction.ActionOnHeroes;
import map.element.interaction.IDoActionOnHeroes;

public abstract class Element implements ISquare {
	private ISprite sprite;
	private Permeability permeability;
	private ActionOnHeroes actionOnHeroes;
	private IMap map;
	
	public Element(final ISprite sprite, final Permeability permeability) {
		this.setSprite(sprite);
		this.setPermeability(permeability);
	}
	
	public Element(final ISprite sprite, final ActionOnHeroes actionOnHeroes) {
		this.setSprite(sprite);
		this.setActionOnHeroes(actionOnHeroes);
	}
	
	public Element(final ISprite sprite, final Permeability permeability, final ActionOnHeroes actionOnHeroes) {
		this.setSprite(sprite);
		this.setPermeability(permeability);
		this.setActionOnHeroes(actionOnHeroes);
	}
	
	public ActionOnHeroes getActionOnHeroes() {
		return this.actionOnHeroes;
	}

	private void setActionOnHeroes(final ActionOnHeroes actionOnHeroes) {
		this.actionOnHeroes = actionOnHeroes;
	}
	
	public Permeability getPermeability() {
		return this.permeability;
	}

	private void setPermeability(final Permeability permeability) {
		this.permeability = permeability;
	}

	protected IMap getMap() {
		return this.map;
	}

	public void setMap(final IMap map) {
		this.map = map;
	}

	@Override
	public Image getImage() {
		return this.getSprite().getImage();
	}
	
	public ISprite getSprite() {
		return this.sprite;
	}

	private void setSprite(final ISprite sprite) {
		this.sprite = sprite;
	}
	}
}