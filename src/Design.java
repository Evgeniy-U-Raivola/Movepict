import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Design extends JComponent implements ActionListener {
    private String path = "C:\\08_JAVA\\SimpleAnimation\\src\\j.png";
    Image buble=new ImageIcon(path).getImage();
    private int x=0,y=0;
    Timer t=new Timer(20,this);

    public  void paint(Graphics g) {
        Graphics2D g1=(Graphics2D)g;
        g1.drawImage(buble,x,y,120,120,null);
        t.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         x+=3; y+=3;
         if(x>=600) {x=0;}
         if(y>=600) {y=0;}
        repaint();
         }
}
