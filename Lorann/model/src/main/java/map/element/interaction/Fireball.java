package map.element.interaction;

import java.awt.Point;

import contract.IMap;
import map.element.ISprite;
import map.element.Permeability;
import map.element.mobile.IMobile;

public class Fireball extends Interaction implements IMobile{

	public Fireball(ISprite sprite, Permeability permeability){
		super(sprite, permeability);
	}
	
	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMap(IMap map, int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isMovePossible(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		
	}

}
