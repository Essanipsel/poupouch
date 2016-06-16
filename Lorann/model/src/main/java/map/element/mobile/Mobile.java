package map.element.mobile;

import java.awt.Point;

import aedt.showboard.IPawn;
import contract.IMap;
import map.element.Element;
import map.element.ISprite;
import map.element.Permeability;

public abstract class Mobile extends Element implements IPawn {
	private final Point position;

	public Mobile(final ISprite sprite) {
		super(sprite, Permeability.BLOCKING);
		this.position = new Point();
	}

	@Override
	public int getX() {
		return this.position.x;
	}

	protected void setX(final int x) {
		if ((x >= 0) && (x < this.getMap().getWidth())) {
			this.position.x = x;
			this.getMap().setMobileHasChanged();
		}
	}

	@Override
	public int getY() {
		return this.position.y;
	}

	protected void setY(final int y) {
		if ((y >= 0) && (y < this.getMap().getHeight())) {
			this.position.y = y;
			this.getMap().setMobileHasChanged();
		}
	}

	@Override
	public Point getPosition() {
		return this.position;
	}

	public void setMap(final IMap map, final int x, final int y) {
		super.setMap(map);
		this.setX(x);
		this.setY(y);
	}

	private boolean isMovePossible(final int x, final int y) {
		return (this.getMap().getElements(x, y).getPermeability() != Permeability.BLOCKING);
	}

	public void moveUp() {
		if (this.isMovePossible(this.getX(), this.getY() - 1)) {
			this.setY(this.getY() - 1);
		}
	}

	public void moveLeft() {
		if (this.isMovePossible(this.getX() - 1, this.getY())) {
			this.setX(this.getX() - 1);
		}
	}

	public void moveDown() {
		if (this.isMovePossible(this.getX(), this.getY() + 1)) {
			this.setY(this.getY() + 1);
		}
	}

	public void moveRight() {
		if (this.isMovePossible(this.getX() + 1, this.getY())) {
			this.setX(this.getX() + 1);
		}
	}
	
}
