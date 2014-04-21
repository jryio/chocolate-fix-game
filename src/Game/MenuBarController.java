package Game;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import View.MainWindow;
import View.MenuBar;

public class MenuBarController extends Component implements MouseListener
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String pressed = "";
	
	
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent e) {
		//Button pressed
		//TODO assign button functions to the game
		if(e.getY() > 420 && e.getY() < 480){
			MenuBar.buttonPressed = "button1";
			pressed = "button1";
			MainWindow.updateMenuBar();
		}
		else if(e.getY() > 510 && e.getY() < 570){
			MenuBar.buttonPressed = "button2";
			pressed = "button2";
			MainWindow.updateMenuBar();
		}
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Assign method calls when the mouse is released.
		if(e.getY() > 420 && e.getY() < 480 && pressed.equals("button1")){
			System.out.println("Button1 Pressed");
			MainWindow.updateMenuBar();
		}
		else if(e.getY() > 510 && e.getY() < 570 && pressed.equals("button2")){
			System.out.println("Button2 Pressed");
			MainWindow.updateMenuBar();
		}
		pressed = "";
		
	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO - Change the color of the button when the mouse enters
		
	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
