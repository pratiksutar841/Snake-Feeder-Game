package Game_Project2;

import java.awt.Color;
import javax.swing.JFrame;

public class Main     //Part1 Start
{
		public static void main(String[] args) 
		{
			JFrame obj = new JFrame();
			GamePlay gameplay = new GamePlay();
			
			obj.setBounds(10,10,905,700);
			obj.setBackground(Color.DARK_GRAY);
			obj.setResizable(false);
			obj.setVisible(true);
			obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			obj.add(gameplay);
	    }

}
