package TicTacToeGui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
/**
 * Class that creates panel. This class will create 9 buttons. 
 * TO DO:  Create action listener for each button.
 * TO DO: Create Tic Tac Toe logic and implement it in this class.
 * @author Vedad_2
 *
 */
public class TicTacToePanel extends JPanel{

	JButton [] buttonList;
	
	public TicTacToePanel() {
		super();
		buttonList = new JButton [9];
		
		this.setLayout(new GridLayout(3,3));
		this.setSize(300, 300);
		
		for(int i=0; i<buttonList.length;i++){
			buttonList[i]= new JButton("Button " +(i+1));
			this.add(buttonList[i]);
		}
		
		
		
	}
}
