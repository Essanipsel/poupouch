package controller;

public class MapPlay implements IOrderPerformed{

	private final IMap	mapWorld;
	private IMap mapMeeting;
	private IMapFrame mapFrame;
	private int playMode;

	public MapPlay(final IMap mapWorld) {
		this.mapWorld = mapWorld;
		this.mapWorld.addMobile(new Lorann(), 1, 1);
	}

	private IMap getMapWorld() {
		return this.mapWorld;
	}

	private IMap getMapMeeting() {
		return this.mapMeeting;
	}

	private IMapFrame getMapFrame() {
		return this.mapFrame;
	}

	public void setMapFrame(final IMapFrame mapFrame) {
		this.mapFrame = mapFrame;
	}

	private int getPlayMode() {
		return this.playMode;
	}

	private void setPlayMode(final int playMode) {
		this.playMode = playMode;
		this.getMapFrame().setViewMode(playMode);
	}

	private IMap getActuelMap() {
		if (this.getPlayMode() == MapMove.VIEW_MODE_MEETING) {
			return this.getMapMeeting();
		}
		return this.getMapWorld();
	}

	@Override
	public void orderPerform(final UserOrder userOrder){
		switch (userOrder) {
			case UP:
				this.getActuelMap().getHero().moveUp();
				break;
			case RIGHT:
				this.getActuelMap().getHero().moveRight();
				break;
			case DOWN:
				this.getActuelMap().getHero().moveDown();
				break;
			case LEFT:
				this.getActuelMap().getHero().moveLeft();
				break;
			case NOP:
			default:
				break;
		}
		this.getWorldAnswer();
	}

	private void resolveEnterCamp() {
		this.setNettleMeeting(new NettleWorld("camp.txt"));
		this.resolveWorldAnswer();
	}

	private void resolveEnterTown(){
		this.setNettleMeeting(new NettleWorld("town.txt"));
		this.resolveWorldAnswer();
	}

	private void resolveEnterMonastery(){
		this.setNettleMeeting(new NettleWorld("monastery.txt"));
		this.resolveWorldAnswer();
	}

	private void resolveWorldAnswer(){
		this.getNettleMeeting().addMobile(new Hero(), 0, 0);
		this.getNettleFrame().setMeeting(this.getNettleMeeting());
		this.setPlayMode(NettleView.VIEW_MODE_MEETING);
	}

	private void exitMetting(){
		this.setPlayMode(NettleView.VIEW_MODE_MAP);
	}

	private void escapeMetting(){
		this.exitMetting();
		this.getActuelNettleWorld().getHero().moveBack();
	}

	private void getWorldAnswer(){
		final IDoActionOnHeroes element = this.getActuelMap().getElements(this.getActuelMap().getHero().getX(),
				this.getActuelMap().getHero().getY());

		switch (element.getActionOnHeroes()) {
			case DIE:
				NettleView.displayMessage("You enter a camp.");
				this.resolveEnterCamp();
				break;
			case ENTER_TOWN:
				NettleView.displayMessage("You enter a town.");
				this.resolveEnterTown();
				break;
			case ENTER_MONASTERY:
				NettleView.displayMessage("You enter a monastery.");
				this.resolveEnterMonastery();
				break;
			case EXIT:
				NettleView.displayMessage("You leave this place.");
				this.exitMetting();
				break;
			case ESCAPE:
				NettleView.displayMessage("You escape this place.");
				this.escapeMetting();
				break;
			case NOP:
			default:
				break;
		}
	}

	private void setMapMeeting(final INettleWorld nettleMeeting) {
		this.nettleMeeting = nettleMeeting;
	}
	
}
