import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class board extends JFrame implements ActionListener{

	 
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
		this.cpu = (int)((Math.random()*13) + 1);
		this.player = (int)((Math.random()*13) + 1);
}
	public void win(){
				
				
				
				
			 }
	public class Card {
	
	public final static int ACE = 14;      // Codes for the non-numeric cards.
        public final static int JACK = 11;    //   Cards 2 through 10 have their 
        public final static int QUEEN = 12;   //   numerical values for their codes.
        public final static int KING = 13;
       
        card1 = new Card( Card.ACE);  
        card2 = new Card(2);  
        card2 = new Card(2);
        card2 = new Card(2);
        card2 = new Card(2);
		
			
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton tile1 = new JButton();
		tile1 = (JButton)(arg0.getsource());
		//System.out.println("Yay");
		if(arg0.getsource() = theButtons[7];
		flip();
		
	}
	
}
