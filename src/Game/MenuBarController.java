package Game;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import View.MainWindow;
import View.MenuBar;

public class MenuBarController extends Component implements MouseListener {

	private static final long serialVersionUID = 1L;
	String pressed = "";

	MenuBar menu = new MenuBar();

	public void mouseClicked(MouseEvent arg0) {

	}

	public void mousePressed(MouseEvent e) {
		// Button pressed
		// TODO assign button functions to the game
		if (menu.getButtons().get(0).contains(e.getPoint())) {
			MenuBar.buttonPressed = "button1";
			pressed = "button1";
			MainWindow.updateMenuBar();
		} else if (menu.getButtons().get(1).contains(e.getPoint())) {
			MenuBar.buttonPressed = "button2";
			pressed = "button2";
			MainWindow.updateMenuBar();
		}

	}

	public void mouseReleased(MouseEvent e) {
		if (menu.getButtons().get(0).contains(e.getPoint())
				&& pressed.equals("button1")) {
			System.out.println("Button1 Pressed");
			MainWindow.updateMenuBar();

		} else if (menu.getButtons().get(1).contains(e.getPoint())
				&& pressed.equals("button2")) {
			System.out.println("Button2 Pressed");
			MainWindow.updateMenuBar();
		}
		pressed = "";
	}

	public void mouseEntered(MouseEvent arg0) {

	}

	public void mouseExited(MouseEvent arg0) {

	}

}
