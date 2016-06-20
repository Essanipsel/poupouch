package view;

import java.awt.Dimension; 
import java.awt.Point;
import java.util.ArrayList;
import aedt.showboard.IPawn;
import aedt.showboard.ISquare;


/**
 * package view.
 * MapBoardPanel.java
 *
 * @author Martial
 *
 */
public class MapBoardPanel extends aedt.showboard.BoardPanel 
{
	private static final long serialVersionUID = 2361367180781892671L;
	/**
	 * Instantiates a new MapBoardPanel.
	 *
	 * @param dimension
	 * @param squares
	 * @param pawns
	 * @param center
	 * @param zoom
	 */
	public MapBoardPanel(final Dimension dimension, final ISquare[][] squares, final ArrayList<?> pawns, final Point center, final int zoom) 
	{
		super(dimension, squares, pawns, center, zoom);
	}
}
