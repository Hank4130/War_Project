import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class board extends JFrame implements ActionListener{

	
	private JButton[] theButtons = new JButton[12];
	private int turn = 0;
	
			
	public board(){
		this.setSize(200, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(3, 4));
		buildBoard();
		
		
	}
			
	public void buildBoard() {

		for (int i = 0; i < theButtons.length; i++) {
			theButtons[i] = new JButton("");
			theButtons[i].setBackground(Color.WHITE);
			this.getContentPane().add(theButtons[i]);
			theButtons[i].addActionListener(this);

		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		
	}
	
}
