package map.element.mobile;

import java.awt.Point;
import map.element.Sprite;

public class Lorann extends Mobile{
	
	private final Point lastPosition;
	private Orientation orientation;

	public Lorann() {
		super(new Sprite("☺!", "lorann_u.png"));
		this.lastPosition = new Point();
		this.lastPosition.setLocation(this.getPosition().x, this.getPosition().y);
	}
	
	

	private void saveLastPosition() {
		if ((this.lastPosition.getX() != this.getPosition().getX()) || (this.lastPosition.getY() != this.getPosition().getY())) {
			this.lastPosition.setLocation(this.getPosition().x, this.getPosition().y);
		}
	}

	@Override
	public void moveUp() {
		this.saveLastPosition();
		super.moveUp();
		this.setOrientation(Orientation.NORD);
	}

	@Override
	public void moveLeft() {
		this.saveLastPosition();
		super.moveLeft();
		this.setOrientation(Orientation.OUEST);
	}

	@Override
	public void moveDown() {
		this.saveLastPosition();
		super.moveDown();
		this.setOrientation(Orientation.SUD);
	}

	@Override
	public void moveRight() {
		this.saveLastPosition();
		super.moveRight();
		this.setOrientation(Orientation.EST);
	}

	public void moveBack() {
		this.setX(this.lastPosition.x);
		this.setY(this.lastPosition.y);
	}
	
	public void setOrientation(Orientation orientation){
		this.orientation = orientation;
	}
	
	public Orientation getOrientation(){
		return orientation;
	}

}
