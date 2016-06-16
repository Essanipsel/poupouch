package map;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Observable;

import contract.IMap;
import map.element.Element;
import map.element.mobile.Lorann;
import map.element.mobile.Mobile;
import map.element.motionless.MotionlessElement;
import map.element.motionless.MotionlessElements;
;


public class Map extends Observable implements IMap{
	
	public MotionlessElement elements[][];
	public final ArrayList<Mobile>	mobiles;
	private int	width;
	private int	height;
	private Lorann lorann;
	public int id_map;
	private Map()
	{
		this.mobiles = new ArrayList<Mobile>();
		
	}
	public Map(final String fileName) throws IOException {
		this();
		try {
			this.loadFile(fileName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void loadFile(final String fileName) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		final BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
		String line;
		int numLine = 0;
		line = buffer.readLine();
		this.width = Integer.parseInt(line);
		line = buffer.readLine();
		this.height = Integer.parseInt(line);
		this.elements = new MotionlessElement[this.getWidth()][this.getHeight()];
		while ((line = buffer.readLine()) != null) {
			for (int x = 0; x < line.toCharArray().length; x++) {
				
				
				this.addElement(MotionlessElements.getFromFileSymbol(line.toCharArray()[x]), x, numLine);
			}
			numLine++;
		}
		buffer.close();
		this.setChanged();
	}
	@Override
	public int getWidth()
	{
		return this.width;
	}
	
	@Override
	public int getHeight()
	{
		return this.height;
	}
	
	@Override
	public MotionlessElement getElements(final int x, final int y) {
		if ((x < 0) || (y < 0) || (x >= this.getWidth()) || (y >= this.getHeight())) {
			return null;
		}
		return this.elements[x][y];
	}
	
	private void addElement(final MotionlessElement element, final int x, final int y) {
		this.elements[x][y] = element;
		if (element != null) {
			element.setMap(this);
		}
		this.setChanged();
	}
	
	@Override
	public void addMobile(final Mobile mobile, final int x, final int y) {
		this.mobiles.add(mobile);
		mobile.setMap(this);
		this.setChanged();
		this.notifyObservers();
	}
	
	@Override
	public Lorann getLorann() {
		return this.lorann;
	}
	@Override
	public void addLorann(final Lorann lorann, final int x, final int y)
	{
		this.setLorann(lorann);
		this.addMobile(lorann, x, y);	
	}
	private void setLorann(final Lorann lorann) {
		this.lorann = lorann;
		this.setChanged();
	}
	@Override
	public Element[][] getElements() {
		return this.elements;
	}
	
	@Override
	public ArrayList<Mobile> getMobiles() {
		return this.mobiles;
	}
	@Override
	public void setMobileHasChanged() {
		this.setChanged();
		this.notifyObservers();
	}
	
	@Override
	public void notifyObservers() {
		super.notifyObservers();
	}
	
	@Override 
	public int getNumMap()
	{
		return this.id_map;
	}
	
	@Override
	public void setNumMap(int id_map)
	{
		this.id_map = id_map;
	}
	public void setLorann(Lorann lorann, int x, int y) {
		// TODO Auto-generated method stub
		
	}
	
	


}
