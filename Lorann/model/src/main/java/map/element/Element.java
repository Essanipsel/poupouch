package map.element;

import java.awt.Image;

import aedt.showboard.ISquare;
import contract.IMap;
import map.element.interaction.ActionOnHeroes;
import map.element.interaction.IDoActionOnHeroes;

public abstract class Element implements ISquare {
	private ISprite sprite;
	private Permeability permeability;
	private ActionOnHeroes action1;
	private ActionOnHeroes action2;
	private IMap map;
	
	public Element(final ISprite sprite, final Permeability permeability) {
		this.setSprite(sprite);
		this.setPermeability(permeability);
	}
	
	public Element(final ISprite sprite, final ActionOnHeroes action1) {
		this.setSprite(sprite);
		this.setAction1(action1);
	}
	
	public Element(final ISprite sprite, final Permeability permeability, final ActionOnHeroes action1) {
		this.setSprite(sprite);
		this.setPermeability(permeability);
		this.setAction1(action1);
	}
	
	public Element(final ISprite sprite, final Permeability permeability, final ActionOnHeroes action1, final ActionOnHeroes action2) {
		this.setSprite(sprite);
		this.setPermeability(permeability);
		this.setAction1(action1);
		this.setAction1(action2);
	}
	
	public ActionOnHeroes getAction1() {
		return this.action1;
	}

	private void setAction1(final ActionOnHeroes action1) {
		this.action1 = action1;
	}
	
	public ActionOnHeroes getAction2() {
		return this.action2;
	}

	private void setAction2(final ActionOnHeroes action2) {
		this.action2 = action2;
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