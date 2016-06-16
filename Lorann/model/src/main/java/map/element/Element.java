package map.element;

import java.awt.Image;

import aedt.showboard.ISquare;
import contract.IMap;

public abstract class Element implements ISquare {
	private ISprite sprite;
	private Permeability permeability;
	private IMap map;
	
	public Element(final ISprite sprite, final Permeability permeability) {
		this.setSprite(sprite);
		this.setPermeability(permeability);
	}
	
	public Permeability getPermeability() {
		return this.permeability;
	}

	private void setPermeability(final Permeability permeability) {
		this.permeability = permeability;
	}

	protected IMap getMap() {
		return this.nettleWorld;
	}

	public void setMap(final INettleWorld nettleWorld) {
		this.nettleWorld = nettleWorld;
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