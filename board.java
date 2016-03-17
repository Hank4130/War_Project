
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
	private int cpu = 0;
	private int player = 0;
	private int cpui = 26;
	private int playeri = 26;
	private int king = 13;
	private int queen = 12;
	private int jack = 11;
	private int ace = 14;
	private int c2 = 2;
	private int c3 = 3;
	private int c4 = 4;
	private int c5 = 5;
	private int c6 = 6;
	private int c7 = 7;
	private int c8 = 8;
	private int c9 = 9;
	private int c10 = 10;
	private int[] ci = new int[26];
	private int[] pi = new int[26];
	//Object card2 = imageIcon("2.png");
	

			
	public board(){
		this.setSize(200, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(3, 4));
		
		buildBoard();
		
		
		
	}
			
	private Object imageIcon(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public void buildBoard() {

		
		
		for (int i = 0; i < theButtons.length; i++) {
			theButtons[i] = new JButton("");
			theButtons[i].setBackground(Color.WHITE);
			this.getContentPane().add(theButtons[i]);
			theButtons[i].addActionListener(this);
			theButtons[i].setBackground(Color.green);
			
			

		}
		
		theButtons[8].setIcon(picts[13]);
		theButtons[3].setIcon(picts[14]);
		
		
		
	}
	
	public void flip(){
			this.cpu = (int)((Math.random()*13) + 1);
			this.player = (int)((Math.random()*13) + 1);
		System.out.println(player + " " + cpu);
		
	}
	public void round(){
		if(this. player > this.cpu){
			
			this.playeri++;
			this.cpui--;
		}
		else if(this.player < this.cpu){
			this.cpui++;
			this.playeri--;
		}
		
		System.out.println(this.playeri + ", " + this.cpui);
	}
	
	
	public void win(){
			
			if (this.cpui == 0){
				
				System.out.println("You Win!");
			}
		}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Object dudeThatGotClicked = arg0.getSource();
		//System.out.println(dudeThatGotClicked.toString());
		JButton theRealDude = (JButton) dudeThatGotClicked;
		if ((theRealDude == theButtons[8]) && theRealDude.isEnabled()){
			flip();						
			}
		
		}
	
	}
