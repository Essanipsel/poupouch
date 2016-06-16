package contract;

import java.util.ArrayList;

public interface IMap {

	public int getWidth();

	public int getHeight();

	public MotionlessElement getElements(int x, int y);

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
	
}