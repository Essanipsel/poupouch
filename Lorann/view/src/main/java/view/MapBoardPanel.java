package view;

import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;

import aedt.showboard.BoardPanel;
import aedt.showboard.IPawn;
import aedt.showboard.ISquare;

public class MapBoardPanel extends BoardPanel {

	public MapBoardPanel(Dimension dimension, ISquare[][] squares, ArrayList<? extends IPawn> pawns, Point center,
			int zoom) {
		super(dimension, squares, pawns, center, zoom);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
