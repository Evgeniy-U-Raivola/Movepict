import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.lang.Math;

public class Design3 extends JComponent implements ActionListener {
    private  String path3="C:\\08_JAVA\\SimpleAnimation\\src\\DD.png";

    private int x3=0, y3=30,k=1,n=1;
    Timer t3=new Timer(10,this);
    BufferedImage sound;
    boolean isChange=false, start=true;
    int colornewR=100,colornewG=20,colornewB=80;

    public void paint(Graphics g) {
          Graphics2D g3=(Graphics2D)g;
          if (start) {
                      try {   sound = ImageIO.read(new File(path3)); }
                      catch (IOException e) { e.printStackTrace(); }
          }
          if (isChange) {
              WritableRaster raster = sound.getRaster();
              for (int j = 0; j < raster.getHeight(); j++) {
                       for (int i = 0; i < raster.getWidth(); i++) {
                          int[] pixel = raster.getPixel(i, j, new int[4]);
                           pixel[0] = colornewR;
                           pixel[1]=colornewG;
                           pixel[2]=colornewB;
                           raster.setPixel(i, j, pixel);
                       }
              }
          sound.setData(raster);
          isChange=false;
          colornewR=(int) (Math.random() * 256);
          colornewG=(int) (Math.random() * 256);
          colornewB=(int) (Math.random() * 256);
          }
          g3.drawImage(sound,x3,y3,150,150,null);
          t3.start();
          start=false;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x3+=k; y3+=n;
        if (x3==452 || x3==-17) { k=-1*k;
                                  isChange=true;}
        if (y3==250 || y3==-35) { n=-1*n;
                                  isChange=true; }
        repaint();
    }
}
