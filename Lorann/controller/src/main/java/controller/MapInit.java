package controller;

import java.io.IOException;

import javax.swing.SwingUtilities;

import contract.IMap;
import contract.IMapFrame;
import map.Map;


import view.MapFrame;

public class MapInit implements Runnable {
	private final IMap	map;
	private final MapPlay		mapPlay;
	private IMapFrame				mapFrame;

	public MapInit() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		this.map = new Map("/resources/map1.txt");
		this.mapPlay = new MapPlay(this.map);
		SwingUtilities.invokeLater(this);
	}

	@Override
	public void run() {
		this.mapFrame = new MapFrame ("Welcome to NettleWorld", this.getMap(), this.getMapPlay());
		this.mapPlay.setMapFrame(this.mapFrame);
	}

	private IMap getMap() {
		return this.map;
	}

	private MapPlay getMapPlay() {
		return this.mapPlay;
	}
	
}
