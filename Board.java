import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Board implements ActionListener
{

    public Board()
    {    
        JFrame frame = new JFrame("Hopper");
        JPanel panel = new JPanel();

        Square[][] square = new Square[5][5];
       
         
        panel.setLayout(new GridLayout(5,5));
      
        //frame.add(panel);
        frame.setTitle("Hopper");
        frame.setSize(700,700);
        frame.setContentPane(panel);

        ImageIcon water = new ImageIcon("water.png");
        ImageIcon lilyPad = new ImageIcon("LilyPad.png");
        ImageIcon greenFrog = new ImageIcon("GreenFrog.png");
        ImageIcon redFrog = new ImageIcon("RedFrog.png");

        for(int x = 0; x < 5; x++)
        {
            for (int y = 0; y < 5; y++)
            {              
                square[x][y] = new Square(1, 1, "water.png");
                panel.add(square[x][y]);
            }
        }
        frame.setVisible(true);

        square[0][0].setIcon(lilyPad);
        square[0][2].setIcon(lilyPad);
        square[0][4].setIcon(lilyPad);

        square[2][0].setIcon(lilyPad);
        square[2][4].setIcon(lilyPad);

        square[3][1].setIcon(lilyPad);
        square[3][3].setIcon(lilyPad);

        square[1][1].setIcon(greenFrog);
        square[1][3].setIcon(greenFrog);
        square[2][2].setIcon(greenFrog);

        square[4][0].setIcon(greenFrog);
        square[4][4].setIcon(greenFrog);

        square[4][2].setIcon(redFrog);

        
      }

      public void buttonPressed()
      {
          for(int x = 0; x < 5; x++) 
          {
              for(int y = 0; y < 5; y++) 
              {
                  square[x][y].addActionListener(this);
              }
          }
      }
  
     
      public void actionPerformed(ActionEvent e)
      { 
          for(int x = 0; x < 5; x++) 
          { 
              for(int y = 0; y < 5; y++) 
              { 
                  if(e.getSource() == square[x][y]){
                  System.out.println("x:" + x + " y:" + y);
                  }  
              }
          }
      }
}

    

