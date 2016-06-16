package controller;

import java.io.IOException;

import contract.*;
import map.element.mobile.Lorann;



public class MapPlay implements IOrderPerform {


	private IMapFrame	mapFrame;
	private IMap		mapWorld;
	private IMap		mapMeeting;
	private int 		playMode;
	public final static int	VIEW_MODE_MAP			= 1;
	public final static int	VIEW_MODE_MEETING	= 2;

	public MapPlay(final IMap map) {
		this.mapWorld = map;
		this.mapWorld.addMobile(new Lorann(), 15, 15);
	}
	
	
	public IMap getMap(){
		return this.mapWorld;
	}
	
	public void setMap(IMap mapWorld){
		this.mapWorld = mapWorld;
	}
	
	public IMap getMapMeeting(){
		return this.mapMeeting;
	}
	
	public void setMapMeeting(IMap mapMeeting){
		this.mapMeeting = mapMeeting;
	}
	
	public IMapFrame getMapFrame(){
		return this.mapFrame;
	}
	
	public IMapFrame setMapFrame (IMapFrame mapFrame){
		this.mapFrame = mapFrame;
	}
	
	private int getPlayMode() {
		return this.playMode;
	}
	
	public IMap getActualMap(){
		if (this.getPlayMode() == IMapFrame.VIEW_MODE_MEETING) {
			return this.getMapMeeting();
		}
		return this.getMap();
	}

	private void setPlayMode(final int playMode) {
		this.playMode = playMode;
		this.getMapFrame().setViewMode(playMode);
	}
	
	public void resolveEnterUp() throws IOException {
		this.setNettleMeeting(new NettleWorld("monastery.txt"));
		this.resolveWorldAnswer();
	}
	
	public void resolveEnterDown() throws IOException {
		this.setNettleMeeting(new NettleWorld("monastery.txt"));
		this.resolveWorldAnswer();
	}
	
	public void resolvePickUp
	
	public void resolveWorldAnswer() throws IOException {
		this.getMapMeeting().addMobile(new Hero(), 0, 0);
		this.getMapFrame().setMeeting(this.getMapMeeting());
		this.setPlayMode(IMapFrame.VIEW_MODE_MEETING);
	}
	
	public void exitMeeting() throws IOException {
		this.setPlayMode(IMapFrame.VIEW_MODE_MAP);
	}
	
	public void getWorldAnswer() throws IOException {
		final IDoActionOnHeroes element = this.getActualMap().getElements(this.getActualMap().getLorann().getX(),
				this.getActualMap().getLorann().getY());

		switch (element.getActionOnHeroes()) {
			case ENTER:
				mapFrame.displayMessage("You go up one floor");
				this.resolveEnterUp();
				break;
			case PICKUP:
				mapFrame.displayMessage("You enter a town.");
				this.resolveEnterTown();
				break;
			case NOENTER :
				mapFrame.displayMessage("You enter a monastery.");
				this.resolveEnterMonastery();
				break;
			case EXIT:
				mapFrame.displayMessage("You go down one floor");
				this.exitMeeting();
				break;
			case NOPE:
			default:
				break;
		}
	}
	
	public void MoveEnnemies() throws IOException {
		
	}
	
	public void setPosEnnemies(int x, int y) throws IOException {
		
	}
	

	
	public void orderPerform(final UserMode userMode) {
		switch (userMode) {
		case UP:
			this.getActualMap().getLorann().moveUp();
			break;
		case RIGHT:
			this.getActualMap().getLorann().moveRight();
			break;
		case DOWN:
			this.getActualMap().getLorann().moveDown();
			break;
		case LEFT:
			this.getActualMap().getLorann().moveLeft();
			break;
		case NOPE:
		default:
			break;
		}
	}
}
