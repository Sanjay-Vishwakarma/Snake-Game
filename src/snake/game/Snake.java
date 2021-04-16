package snake.game;

import javax.swing.*;

public class Snake extends JFrame {

	public Snake() {
		super("Snake Game");
//		Board b = new Board();
//		add(b);
		add(new Board());
		pack();
//		setLocation(200,200);
		setLocationRelativeTo(null);
//		setTitle("Sanke Game");
		setResizable(false);
	}

	// Driver
	public static void main(String[] args) {
		new Snake().setVisible(true);
	}

}
