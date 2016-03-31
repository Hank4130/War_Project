
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class board extends JFrame implements ActionListener{
	
private ImageIcon[] picts = {new ImageIcon("2.png") 
			,new ImageIcon("3.png"),new ImageIcon("4.png"),
			new ImageIcon("5.png"),new ImageIcon("6.png"),
			new ImageIcon("7.png"),new ImageIcon("8.png"),
			new ImageIcon("9.png"),new ImageIcon("10.png"),
			new ImageIcon("jack.png"),new ImageIcon("queen.png"),
			new ImageIcon("king.png"),new ImageIcon("ace.png"),
			 new ImageIcon("blueDeck.png"), new ImageIcon("BrownDeck.png"),
			  new ImageIcon("Fetty.png")};
	
	
	
	private JButton[] theButtons = new JButton[12];
	private int cpu = 0;
	private int player = 0;
	private int cpui = 26;
	private int playeri = 26;
	/*private int king = 12;
	private int queen = 11;
	private int jack = 10;
	private int ace = 13;
	private int c2 = 1;
	private int c3 = 2;
	private int c4 = 3;
	private int c5 = 4;
	private int c6 = 5;
	private int c7 = 6;
	private int c8 = 7;
	private int c9 = 8;
	private int c10 = 9;*/
	private int[] ci = new int[cpui];
	private int[] pi = new int[playeri];
	
	public void inventory(){
	
	ci[1] = 2;  	pi[1] = 2;
	ci[2] = 2;	pi[2] = 2;
	ci[3] = 3;	pi[4] = 3;
	ci[4] = 3;	pi[3] = 3;
	ci[5] = 4;	pi[5] = 4;
	ci[6] = 4;	pi[6] = 4;
	ci[7] = 5;	pi[7] = 5;
	ci[8] = 5;	pi[8] = 5;
	ci[9] = 6;	pi[9] = 6;
	ci[10] = 6;	pi[10] = 6;
	ci[11] = 7;	pi[11] = 7;
	ci[12] = 7;	pi[12] = 7;
	ci[13] = 8;	pi[13] = 8;
	ci[14] = 8;	pi[14] = 8;
	ci[15] = 9;	pi[15] = 9;
	ci[16] = 9;	pi[16] = 9;
	ci[17] = 10;	pi[17] = 10;	
	ci[18] = 10;	pi[18] = 10;	
	ci[19] = 11;	pi[19] = 11;	
	ci[20] = 11;	pi[20] = 11;	
	ci[21] = 12;	pi[21] = 12;	
	ci[22] = 12;	pi[22] = 12;	
	ci[23] = 13;	pi[23] = 13;	
	ci[24] = 13;	pi[24] = 13;	
	ci[25] = 14;	pi[25] = 14;	
	ci[26] =  14;	pi[26] =  14;		
										
	}
	
	
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
			theButtons[i].setBorder((Border) Color.green);
			

		}
		
		theButtons[8].setIcon(picts[13]);
		theButtons[3].setIcon(picts[14]);
		
		
		
	}
	
	public void flip(){
			this.cpu = (int)((Math.random()*13) + 1);
			this.player = (int)((Math.random()*13) + 1);
		System.out.println(player + " " + cpu);
		theButtons[5].setIcon(picts[player-1]);
		theButtons[6].setIcon(picts[cpu-1]);
		
	}
	public void round(){
		
		
		if(player > cpu){
			
			this.playeri+=1;
			this.cpui-=1;
			yeahBaby();
			
			update();
			//theButtons[7].setText("");
			System.out.println("you win");
			//JOptionPane.showMessageDialog(null, "black wins");
		}
		else if(this.player < this.cpu){
			this.cpui+=1;
			this.playeri-=1;
			update();
	//		theButtons[7].setText("You have " + "");
		//	theButtons[4].setText("");
			//JOptionPane.showMessageDialog(null, "black wins");
		}
		else if (this.player == this.cpu){
			flip();
		}
		
		// think about using while loop
		System.out.println(this.playeri + ", " + this.cpui);
	}
	public void update() {
	
		theButtons[7].setText(cpui + " cerds");
		theButtons[4].setText(playeri + " cerds");
	}
	
	public void win(){
			this.setSize(800, 480);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			if (this.cpui == 0){
				
				System.out.println("You Win!");
			}
		}
	
	public void yeahBaby(){
		    try {
		        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("H:/images/YeahBaby.wav").getAbsoluteFile());
		        Clip clip = AudioSystem.getClip();
		        clip.open(audioInputStream);
		        clip.start();
		    } catch(Exception ex) {
		        System.out.println("make sure the files are uploaded correctly so that the sound can play also make sure the the file is properly being directed to elcipse");
		        ex.printStackTrace();
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
			round();
			}
		
		}
	
	}
