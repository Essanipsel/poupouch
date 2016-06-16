package map.element.interactions;

import java.awt.Point;

import contract.ActionOnHeroes;
import contract.IMap;
import map.element.ISprite;
import map.element.Permeability;
import map.element.Sprite;
import map.element.mobile.IMobile;

public class Fireball extends Interactions implements IMobile {

	

	public Fireball(ISprite sprite, Permeability permeability, char fileSymbol,ActionOnHeroes action, ActionOnHeroes action2) {
		super(new Sprite("°°", "fireball.jpg"), Permeability.PENETRABLE, 'F',ActionOnHeroes.PICKUP,ActionOnHeroes.DIE_MONSTER);
		// TODO Auto-generated constructor stub
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
