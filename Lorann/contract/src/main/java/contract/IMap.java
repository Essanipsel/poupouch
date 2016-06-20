package contract;

import java.util.ArrayList;
import java.util.Observer;

import map.element.Element;
import map.element.mobile.Lorann;
import map.element.mobile.Mobile;
import map.element.motionless.MotionLessElement;

public interface IMap {

	public int getWidth();

	public int getHeight();

	public MotionLessElement getElements(int x, int y);

	public Lorann getLorann();

	public void addMobile(Mobile mobile, int x, int y);

	public void addMobile(Lorann lorann, int x, int y);

	public void setMobileHasChanged();

	public Element[][] getElements();

	public ArrayList<Mobile> getMobiles();

	public void addObserver(Observer o);
	
	public int getNumMap();
	
	public int setNumMap(int id);
	
	public void setLorann(Lorann lorann, int x, int y);
	
	private void loadfile()
	
}