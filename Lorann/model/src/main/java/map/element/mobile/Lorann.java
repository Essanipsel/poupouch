package map.element.mobile;

import java.awt.Point;

import map.element.Sprite;

public class Lorann extends Mobile {

	
	private final Point lastPosition;
	private Orientation Orientation;
	

	public Lorann() {
		super(new Sprite("☺!", "lorann.png"));
		this.lastPosition = new Point();
		this.lastPosition.setLocation(this.getPosition().x, this.getPosition().y);
	}

	private void saveLastPosition() {
		if ((this.lastPosition.getX() != this.getPosition().getX()) || (this.lastPosition.getY() != this.getPosition().getY())) {
			
			
			this.lastPosition.setLocation(this.getPosition().x, this.getPosition().y);
		}
	}

	@Override
	public void moveUp() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		this.saveLastPosition();
		super.moveUp();
		this.setOriention(map.element.mobile.Orientation.NORD);
		
	}

	@Override
	public void moveLeft() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		this.saveLastPosition();
		super.moveLeft();
		
	}

	@Override
	public void moveDown() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		this.saveLastPosition();
		super.moveDown();
	}

	@Override
	public void moveRight() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		this.saveLastPosition();
		super.moveRight();
	}

	public void moveBack() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		this.setX(this.lastPosition.x);
		this.setY(this.lastPosition.y);
	}
	public Orientation getOrientation()
	{
		return this.Orientation;
		
	}
	public void setOriention(Orientation orientation)
	{
		this.Orientation = orientation;
		
	}
}