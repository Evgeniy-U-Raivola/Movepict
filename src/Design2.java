import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;

public class Design2 extends JComponent implements ActionListener {
    private  String path2="C:\\08_JAVA\\SimpleAnimation\\src\\javaLabel.jpg";
    Image label=new ImageIcon(path2).getImage();
    private int x2=20,y2=20;
    Timer t2=new Timer(10,this);
    private int var=0;

    public void paint(Graphics g) {
        Graphics2D g2=(Graphics2D)g;
        switch (var) {
            case (0):
                 g2.drawImage(label, x2, y2, 100, 100, null);
                 t2.start();
                 break;
            case (90):
                 AffineTransform origLabel;
                 origLabel=g2.getTransform();
                 AffineTransform newLabel=(AffineTransform)(origLabel.clone());
                 newLabel.rotate(1.57,x2+50,y2+50);
                 g2.setTransform(newLabel);
                 g2.drawImage(label,x2,y2,100,100,null);
                 g2.setTransform(origLabel);
                 break;
            case (180):
                AffineTransform origLabel1;
                origLabel1=g2.getTransform();
                AffineTransform newLabel1=(AffineTransform)(origLabel1.clone());
                newLabel1.rotate(3.14,x2+50,y2+50);
                g2.setTransform(newLabel1);
                g2.drawImage(label,x2,y2,100,100,null);
                g2.setTransform(origLabel1);
                break;
            case (270):
                AffineTransform origLabel2;
                origLabel2=g2.getTransform();
                AffineTransform newLabel2=(AffineTransform)(origLabel2.clone());
                newLabel2.rotate(4.71,x2+50,y2+50);
                g2.setTransform(newLabel2);
                g2.drawImage(label,x2,y2,100,100,null);
                g2.setTransform(origLabel2);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(x2==20 && y2==20) { var=0; } // 0 град
        if(y2==20 && x2<300) {x2+=2; }
        if(x2==300 && y2==20) { var=90;}  // 90 град
        if(x2==300 && y2<300) {y2+=2;}
        if(x2==300 && y2==300) { var=180; }  // 180 град
        if(y2==300 && x2>20) {x2=x2-2; }
        if(x2==20 && y2==300) { var=270;}    //270 град
        if(x2==20 && y2>20) { y2=y2-2; }
       repaint();
    }

    public void rotate_image() {


    }
}
