import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Square extends JButton
{
    ImageIcon imageIcon;
    int xPosition;
    int yPosition;
    String imageName;

    public Square(int x, int y, String image)
    {
        imageIcon = new ImageIcon(image);
        setIcon(new ImageIcon(image));
        xPosition = x;
        yPosition = y;
    }

    public int getXPosition()
    {
        return xPosition;
    }

    public void setXPosition(int x)
    {
        this.xPosition = x;
    }

    public int getYPosition()
    {
        return yPosition;
    }

    public void setYPosition(int y)
    {
        this.yPosition = y;
    }

    public ImageIcon getImageIcon()
    {
        return imageIcon;
    }

    public void setImageIcon(String image)
    {
        this.imageIcon = new ImageIcon(image);
    }

    public void moveTo()
    {
        //get the icon of the current square
        //this.getImageIcon();

        //System.out.println(this.getImageIcon());
        // set the current square's icon to be a lily pad

        //set the new square's icon to be the icon of the old square (frog)
    }

}

