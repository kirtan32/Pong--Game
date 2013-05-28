import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * basic pong game 
 * creates the basic JPanel, which the game is the built off of
 * Creator: Megan Troxel
 * Date created: 5/19/2013
 */

public class Pong extends JFrame {
	private static JFrame pong = new JFrame("Pong Game");
	
	/*
	 * Default Constructor that creates the JPanel which the is put on the JFrame
	 * allows the paddles and ball to have something to be built on 
	 */
	public Pong(){
		JPanel game	= new JPanel();
		game.setLayout(new FlowLayout());
	
		// reads pongball image and adds a label to the panel
		JLabel pongBallLabel = new JLabel(new ImageIcon("Pongball.png"));
		game.add(pongBallLabel);
		// adds label to the Frame
		this.add(game);
		
		// reads player1 and player2 paddles and adds a label to the panel
		JLabel player1Label = new JLabel(new ImageIcon("player1.png"));
		game.add(player1Label);
		this.add(game);
		
		JLabel player2Label =  new JLabel(new ImageIcon("player2.png"));
		game.add(player2Label);
		this.add(game);
		
	}
	
	/*
	 * creates the frame that the panel is created on
	 * the starting point of the entire layout
	 */
	public static void main(String args[]){
		Pong frame = new Pong();
		frame.setTitle("Pong Game");
		frame.setSize(600,400);	
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);	
	}
}
