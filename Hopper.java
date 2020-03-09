import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;

public class Hopper implements ActionListener
{
     JFrame frame = new JFrame("Hopper");
     JPanel panel = new JPanel();
     JButton button[];
     double xPosition;	

     public Hopper()
    {

        button = new JButton[26];

         for(int i = 0; i < 25; i++)
        {
            button[i] = new JButton(String.valueOf(i));
            button[i].setIcon(new ImageIcon("Water.png"));
        }
         

        panel.setLayout(new GridLayout(5,4));
        for(int i = 0; i < 25; i++) {
            panel.add(button[i]);
        }
        frame.add(panel);
        frame.setTitle("Hopper");
        frame.setSize(600,600);
        frame.setContentPane(panel);
        frame.setVisible(true);
        
      }
    


    // public void square(BufferedImage image)
    // {

    //     for(int i = 0; i < 25; i++) {
    //         button[i].addActionListener(this);
    //     }

    //     button.setIcon(new ImageIcon(image));

    //     // for(int i = 0; i < 25; i+=2)
    //     // {
            
    //     //     button[i].setIcon(new ImageIcon("LilyPad.png"));
    //     // }
    // }



    public void actionPerformed(ActionEvent e)
    { 
        for(int i = 0; i < 25; i++) {  
        if(e.getSource() == button[i])
        {

           System.out.println(button[i]);

        }
    }
}
}




    