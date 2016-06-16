package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Point;
import controller.IOrderPerformed;
import model.Map;


/**
 * package view.
 * MapFrame.java
 *
 * @author Martial
 *
 */
public class MapFrame extends JFrame implements KeyListener,IMapFrame
{
private static final long				serialVersionUID	= 1500600853286674118L;
private final MapBoardPanel 		mapPanel;   
private MapBoardPanel				meetingPanel;
private final IOrderPerformed		mapPlay;
private final MapCardView		mapCardView;

	/**
	 * Instantiates a new MapFrame.
	 *
	 * @param title
	 * @param Map
	 * @param mapPlay
	 */
	public MapFrame (final String title, final IMap Map, final IOrderPerformed mapPlay) 
			{
		this.setTitle(title);
		this.setSize(1000, 800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.mapPlay = mapPlay;
		this.mapPanel = new NettleBoardPanel(new Dimension(Map.getWidth(), Map.getHeight()), Map.getElements(), Map.getMobiles(),
				Map.getHero().getPosition(), MapMove.MAP_ZOOM);
		this.setResizable(false);
		Map.addObserver(this.mapPanel);
		this.addKeyListener(this);
		this.mapCardView = new MapCardView();
		this.getContentPane().setLayout(this.mapCardView);
		this.getContentPane().add(this.mapPanel, "MAP");
		this.setVisible(true);
	}
	
	/**
	 * @return
	 *IOrderPerformed
	 */
	public IOrderPerformed getMapPlay() 
	{
		return this.mapPlay;	
	}

	/**
	 * @param center
	 *void
	 */
	public void refresh( final Point center) 
	{
		this.mapPanel.setCenter(center);
	}

	/* (non-Javadoc)
	 * @see view.IMapFrame#setMeeting(IMap)
	 */
	@Override
	public void setMeeting(final IMap Map) 
	{
	
		if (this.meetingPanel != null) 
		{
			this.mapCardView.removeLayoutComponent(this.meetingPanel);
		}
		
		this.meetingPanel = new NettleBoardPanel(new Dimension(Map.getWidth(), Map.getHeight()), Map.getElements(),
				Map.getMobiles(),MapMove.MAP_ZOOM);
		
		Map.addObserver(this.meetingPanel);
		this.getContentPane().add(this.meetingPanel, "MEETING");
	}
	
	/* (non-Javadoc)
	 * @see view.IMapFrame#setViewMode(int)
	 */
	@Override
	public void setViewMode(final int viewMode) 
	{
		switch (viewMode) 
		{
			case MapMove.VIEW_MODE_MEETING:
				this.mapCardView.show(this.getContentPane(), "MEETING");
				break;
			case MapMove.VIEW_MODE_MAP:
				this.mapCardView.show(this.getContentPane(), "MAP");
				break;
			default:
				break;
		}
	}
	
	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyPressed(final KeyEvent keyEvent)
	{
		try {
			this.getMapPlay().orderPerform(MapMove.KeyCodeToUserOrder(keyEvent.getKeyCode()));
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}
	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyReleased(final KeyEvent arg0)
	{
		
	}
	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyTyped(final KeyEvent arg0) 
	{
		
	}

}
