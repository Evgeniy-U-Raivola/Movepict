import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Solaris extends JComponent implements ActionListener {
    final String path5_1="C:\\08_JAVA\\SimpleAnimation\\src\\Sun.png";
    final String path5_2="C:\\08_JAVA\\SimpleAnimation\\src\\Earth.png";
    private int x51=300,y51=250, x52=50,y52=270;
    private int radius=290;
    private double tGrad=0, resx,resy,rotGrad=0;

    private BufferedImage sun,earth;

    Timer t4=new Timer(10,this);

    public void paint(Graphics g) {
        Graphics2D g4=(Graphics2D)g;
        try {   sun = ImageIO.read(new File(path5_1));
                earth=ImageIO.read(new File(path5_2)); }
        catch (IOException e) { e.printStackTrace(); }

        g4.drawImage(sun,x51,y51,150,150,null);
        AffineTransform origLabel;
        origLabel=g4.getTransform();
        AffineTransform newLabel=(AffineTransform)origLabel.clone();
        newLabel.rotate(rotGrad,x52+35,y52+35);
        g4.setTransform(newLabel);
        g4.drawImage(earth,x52,y52,70,70,null);
        g4.setTransform(origLabel);
        t4.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
           resx=radius*Math.cos(tGrad);
           x52 = ((int) resx)+360;
           resy=radius*Math.sin(tGrad);
           y52=((int) resy)+300;
        repaint();
           tGrad=tGrad==361?0:tGrad+0.01;
           rotGrad=rotGrad==-361?0:rotGrad-0.05;

    }


   }
