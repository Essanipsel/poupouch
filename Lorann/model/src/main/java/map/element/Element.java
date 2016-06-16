package map.element;

import java.awt.Image;

import aedt.showboard.ISquare;
import contract.ActionOnHeroes;
import contract.IMap;

public abstract class Element implements ISquare{
	
	private ISprite				sprite;
	private Permeability	permeability;
	private IMap	map;
	
	private ActionOnHeroes action;
	private ActionOnHeroes action2;
	

	public Element(final ISprite sprite, final Permeability permeability) {
		this.setSprite(sprite);
		this.setPermeability(permeability);
	}
	public Element(final ISprite sprite,final Permeability permeability,final ActionOnHeroes action) {
		this.setSprite(sprite);
		this.setPermeability(permeability);
		
		this.setAction(action)  ;
	}
	public Element(final ISprite sprite,final Permeability permeability,final ActionOnHeroes action,final ActionOnHeroes action2) {
		this.setSprite(sprite);
		this.setPermeability(permeability);
		
		this.setAction(action);
		this.setAction2(action2);
	}
	public ActionOnHeroes getAction()
	{
		return this.action;
	}
	public ActionOnHeroes getAction2()
	{
		return this.action2;
	}
	public void setAction(final ActionOnHeroes action)
	{
		this.action = action;
	}
	public void setAction2(final ActionOnHeroes action)
	{
		this.action2 = action;
	}

	public ISprite getSprite() {
		return this.sprite;
	}

	private void setSprite(final ISprite sprite) {
		this.sprite = sprite;
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

}
