package contract;

import java.util.ArrayList;
import java.util.Observer;

import map.element.Element;
import map.element.mobile.Lorann;
import map.element.mobile.Mobile;
import map.element.motionless.MotionlessElement;


public interface IMap {
	int MAP_ZOOM = 0;

	public int getWidth();

	public int getHeight();
	
	public MotionlessElement getElements(int x, int y);

	public Lorann getLorann();

	public void addMobile(Mobile mobile, int x, int y);

	public void addLorann(Lorann lorann, int x, int y);

	public void setMobileHasChanged();
	
	public Element[][] getElements();

	public ArrayList<Mobile> getMobiles();

	public void addObserver(Observer o);
	
	public int getNumMap();
	
	public void setNumMap(int id);
	
	public void setLorann(Lorann lorann,int x,int y);
	
	//public void l
	
}
