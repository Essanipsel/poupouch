package map.element.mobile;

import java.awt.Point;

import contract.IMap;

public interface IMobile {
	public int getX();
	public void setX(final int x);
	public int getY();
	public void setY(final int y);
	public Point getPosition();
	public void setMap(final IMap map, final int x, final int y);
	public boolean isMovePossible(final int x, final int y);
	public void moveUp();
	public void moveLeft();
	public void moveDown();
	public void moveRight();

}
