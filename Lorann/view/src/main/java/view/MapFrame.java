package view;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


import javax.swing.JFrame;

import contract.IMap;
import contract.IOrderPerform;



public class MapFrame extends JFrame implements KeyListener, IMapFrame {
	private static final long				serialVersionUID	= 1500600853286674118L;
	private final MapBoardPanel	mapPanel;
	private MapBoardPanel				meetingPanel;
	private final IOrderPerform		mapPlay;
	private final MapCardView		mapCardView;
	

	public MapFrame(final String title, final IMap map, final IOrderPerform mapPlay) {
		this.setTitle(title);
		this.setSize(700, 700);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.mapPlay = mapPlay;
		this.mapPanel = new MapBoardPanel(new Dimension(map.getWidth(), map.getHeight()), map.getElements(), map.getMobiles(),
				map.getLorann().getPosition(), IMap.MAP_ZOOM);
		this.setResizable(false);
		map.addObserver(this.mapPanel);
		this.addKeyListener(this);
		this.mapCardView = new MapCardView();
		this.getContentPane().setLayout(this.mapCardView);
		this.getContentPane().add(this.mapPanel, "MAP");
		this.setVisible(true);
	}

	private IOrderPerform getNettlePlay() {
		return this.mapPlay;
	}

	@Override
	public void setMeeting(final IMap map) {
		if (this.meetingPanel != null) {
			this.mapCardView.removeLayoutComponent(this.meetingPanel);
		}
		this.meetingPanel = new MapBoardPanel(new Dimension(map.getWidth(), map.getHeight()), map.getElements(),
				map.getMobiles(), map.getLorann().getPosition(), MapView.MEETING_ZOOM);
		map.addObserver(this.meetingPanel);
		this.getContentPane().add(this.meetingPanel, "MEETING");
	}

	public void refresh(final Point center) {
		this.mapPanel.setCenter(center);
	}

	@Override
	public void setViewMode(final int viewMode) {
		switch (viewMode) {
			case MapView.VIEW_MODE_MEETING:
				this.mapCardView.show(this.getContentPane(), "MEETING");
				break;
			case MapView.VIEW_MODE_MAP:
				this.mapCardView.show(this.getContentPane(), "MAP");
				break;
			default:
				break;
		}
	}

	@Override
	public void keyPressed(final KeyEvent keyEvent) {
		this.getNettlePlay().orderPerform(MapView.keyCodeToUserOrder(keyEvent.getKeyCode()));
	}

	@Override
	public void keyReleased(final KeyEvent arg0) {
	}

	@Override
	public void keyTyped(final KeyEvent arg0) {
	}

	
}
