package TicTacToeGui;

import javax.swing.JFrame;

public class Play {
	
	public static void main(String[] args) {
	
		JFrame game = new JFrame();
		TicTacToePanel gamePanel = new TicTacToePanel();
		
		game.getContentPane().add(gamePanel);
		
		game.setSize(500, 500);
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.setVisible(true);
	}
}
