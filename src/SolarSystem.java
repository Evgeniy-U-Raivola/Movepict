import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SolarSystem extends JComponent implements ActionListener {
    final String path61="C:\\08_JAVA\\SimpleAnimation\\src\\media\\Sun.png";
    final String path62="C:\\08_JAVA\\SimpleAnimation\\src\\media\\Mercury.png";
    final String path63="C:\\08_JAVA\\SimpleAnimation\\src\\media\\Venus.png";
    final String path64="C:\\08_JAVA\\SimpleAnimation\\src\\media\\Earth.png";
    final String path65="C:\\08_JAVA\\SimpleAnimation\\src\\media\\Mars.png";
    final String path66="C:\\08_JAVA\\SimpleAnimation\\src\\media\\Jupiter.png";
    final String path67="C:\\08_JAVA\\SimpleAnimation\\src\\media\\Saturn.png";
    final String path68="C:\\08_JAVA\\SimpleAnimation\\src\\media\\Uranus.png";
    final String path69="C:\\08_JAVA\\SimpleAnimation\\src\\media\\Neptune.png";
    private int x61=450,y61=250;

    Timer t6=new Timer(10,this);

    private BufferedImage sun;

     public void paint(Graphics g) {
         Graphics2D g6 = (Graphics2D)g;

         try { sun = ImageIO.read(new File(path61)); }
         catch (IOException e) {e.printStackTrace(); }

         g6.drawImage(sun,x61,y61,150,150,null);
         t6.start();
     }

    @Override
    public void actionPerformed(ActionEvent e) {
         repaint();
    }
}
