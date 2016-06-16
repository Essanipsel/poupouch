package view;

import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

import contract.UserMode;



public class MapView {
	public static int				MAP_ZOOM					= 4;
	public static int				MEETING_ZOOM			= 3;
	public final static int	VIEW_MODE_MAP			= 1;
	public final static int	VIEW_MODE_MEETING	= 2;

	public static UserMode keyCodeToUserOrder(final int keyCode) {
		switch (keyCode) {
			case KeyEvent.VK_UP:
				return UserMode.UP;
			case KeyEvent.VK_RIGHT:
				return UserMode.RIGHT;
			case KeyEvent.VK_DOWN:
				return UserMode.DOWN;
			case KeyEvent.VK_LEFT:
				return UserMode.LEFT;
			default:
				return UserMode.NOPE;
		}
	}

	public static void displayMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}
}
