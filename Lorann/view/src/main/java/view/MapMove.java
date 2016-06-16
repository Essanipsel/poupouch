
package view;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


/**
 * package view.
 * MapMove.java
 *
 * @author Martial
 *
 */
public class MapMove 
{
	public static int				MAP_ZOOM			= 4;
	public static int				MEETING_ZOOM		= 4;
	public final static int	VIEW_MODE_MAP			= 1;
	public final static int	VIEW_MODE_MEETING	= 2;
	

	/**
	 * @param keyCode
	 * @return
	 *UserOrder
	 */
	public static UserOrder KeyCodeToUserOrder(final int keyCode)
	{
		switch (keyCode) 
		{
			case KeyEvent.VK_UP:
				return UserOrder.UP;
			case KeyEvent.VK_RIGHT:
				return UserOrder.RIGHT;
			case KeyEvent.VK_DOWN:
				return UserOrder.DOWN;
			case KeyEvent.VK_LEFT:
				return UserOrder.LEFT;
			default:
				return UserOrder.NOP;
		}	
	}
	
	/**
	 * @param message
	 *void
	 */
	public static void displayMessage(final String message) 
	{
		JOptionPane.showMessageDialog(null, message);
	}
}
