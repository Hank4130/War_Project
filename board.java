import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class board extends JFrame implements ActionListener{
	
	private ImageIcon[] picts = { new ImageIcon("ace.png"),
			new ImageIcon("2.png"),new ImageIcon("3.png"),
			new ImageIcon("4.png"),new ImageIcon("5.png"),
			new ImageIcon("6.png"),new ImageIcon("7.png"),
			new ImageIcon("8.png"),new ImageIcon("jack.png"),
			new ImageIcon("queen.png"),new ImageIcon("king.png"),
			new ImageIcon("9.png"),new ImageIcon("10.png"), new ImageIcon("blueDeck.png"), new ImageIcon("BrownDeck.png")};

	 
	private JButton[] theButtons = new JButton[12];
	private int cpu;
	private int player;
	private int cpui = 26;
	private int playeri = 26;
			
	public board(){
		this.setSize(200, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(3, 4));
		buildBoard();
		
		
	 }
			
	public void buildBoard(){

		for (int i = 0; i < theButtons.length; i++) {
			theButtons[i] = new JButton("");
			theButtons[i].setBackground(Color.WHITE);
			this.getContentPane().add(theButtons[i]);
			theButtons[i].addActionListener(this);

		}
	 }
	public void flip(){
		this.cpu = (int)((Math.random()*14) + 2);
		this.player = (int)((Math.random()*14) + 2);
}
	public void win(){
				
				
				
				
			 }
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Object dudeThatGotClicked = arg0.getSource();
		System.out.println(dudeThatGotClicked.toString());
		JButton theRealDude = (JButton) dudeThatGotClicked;
		if (theButtons[8].isEnabled()){
			flip();						
		}
		
	}
	
}
