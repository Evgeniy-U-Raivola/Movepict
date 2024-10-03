import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Main extends JFrame{
    static JFrame Okno1=new JFrame(" Солнечная система");
    public static void main(String[] args) throws Exception {
        Scanner t = new Scanner(System.in);
        System.out.println("");
        System.out.println("Меню: 1 -движение по прямой, 2 -по квадрату, 3-произвольно/смена цвета,");
        System.out.println("      4 -земля вокруг солнца, 5 - солнечная система)");
        System.out.println("      0 - ВЫХОД :");

        int x = t.nextInt();
        while (x != 0) {
            if (x == 1) {
                JFrame Okno = new JFrame("Движение");
                Design d1 = new Design();
                Okno.add(d1);
                Okno.setBounds(0, 0, 600, 600);
                Okno.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Okno.setResizable(true);
                Okno.setLocationRelativeTo(null);
                Okno.setVisible(true);
                Okno.setAlwaysOnTop(true);
            }
            if (x == 2) {
                JFrame Okno = new JFrame("Ходим по квадрату");
                Design2 d2 = new Design2();
                Okno.add(d2);
                Okno.setBounds(0, 0, 500, 500);
                Okno.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Okno.setResizable(true);
                Okno.setLocationRelativeTo(null);
                Okno.setVisible(true);
                Okno.setAlwaysOnTop(true);
            }
            if (x == 3) {
                JFrame Okno = new JFrame("Хаотичненько  DOLBY DIGITAL");
                Design3 d3 = new Design3();

                Okno.setBounds(0, 0, 600, 400);
                Okno.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Okno.setResizable(false);
                Okno.setLocationRelativeTo(null);
                Okno.setVisible(true);
                Okno.setAlwaysOnTop(true);
                Okno.getContentPane().setBackground(Color.CYAN);
                Okno.add(d3);
            }
            if (x == 4) {
                JFrame Okno = new JFrame("Земля,Земля, я Юпитер");
                Solaris s1 = new Solaris();

                Okno.setBounds(0, 0, 800, 700);
                Okno.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Okno.setResizable(false);
                Okno.setLocationRelativeTo(null);
                Okno.setVisible(true);
                Okno.setAlwaysOnTop(true);
                Okno.getContentPane().setBackground(Color.BLACK);
                Okno.add(s1);
            }
            if (x == 5) {
// . . . . . . . . . . . . . . . . . . . . . . . . . . . .
             String[][] planets=new String[][] {new String[]{"Mercury","105","5"},new String[]{"Venus","140","15"},
                   new String[]{"Earth","160","20"},new String[]{"Mars","200","35"},new String[]{"Jupiter","220","60"},
                   new String[]{"Saturn","270","90"},new String[]{"Uranus","300","130"} ,new String[]{"Neptune","330","150"}};
             String planet;
             int r,d;

                   Okno1.setBounds(0, 0, 1000, 730);
                   Okno1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                   Okno1.setLocationRelativeTo(null);
                   Okno1.setResizable(false);
//                   Okno1.setAlwaysOnTop(true);
                   Okno1.getContentPane().setLayout(null);
                   Okno1.getContentPane().setBackground(Color.BLACK);
                   Sun s=new Sun();
                       for (int i = 0; i < 8; i++) {
                           planet=planets[i][0];
                           r=Integer.valueOf(planets[i][1]);
                           d=Integer.valueOf(planets[i][2]);
                           new Run(new Sun(planet,r),d).start();
                       }
                   Okno1.setVisible(true);

             }
                x = t.nextInt();
            }
            System.out.println("                   ###    ### #ЭТОКОНЕЦ# ###   ### ");
            System.exit(0);
        }


    public static class Sun {
        private String planet="";
        private int r=70;
        String path61 = "C:\\08_JAVA\\SimpleAnimation\\src\\media\\Sun.png";
        public int x71 = 430, y71 = 300, wsun,hsun,wpl,hpl;
        public JLabel sun2, plxx2;

                 public Sun() throws IOException {
                     BufferedImage sun1 = ImageIO.read(new File(path61));
                     wsun=sun1.getWidth();
                     hsun= sun1.getHeight();
                     sun2 = new JLabel(new ImageIcon(sun1));
                     sun2.setBounds(x71, y71, wsun,hsun);
                     Okno1.add(sun2);
                 }
                 public Sun(String planet, int r) throws IOException{
                     this.planet = planet;
                     this.r=r;

                     BufferedImage plxx = ImageIO.read(new File("C:\\08_JAVA\\SimpleAnimation\\src\\media\\"+planet+".png"));
                     wpl=plxx.getWidth();
                     hpl=plxx.getHeight();
                     plxx2=new JLabel(new ImageIcon(plxx));
                     plxx2.setBounds(x71-r,y71+40,wpl,hpl);
                     Okno1.add(plxx2);
                 }
    }

    public static class Run  extends Thread{
        private int delay;
        Sun planet;
        private double tGrad;
        public Run(Sun sun, int delay) {
            this.planet=sun;
            this.delay=delay;
        }
        @Override
        public void run() {
            for (int i=0; i<1750;) {
                try {
                    Thread.sleep(delay);
                    planet.plxx2.setBounds((int) (planet.r * Math.cos(tGrad * Math.PI / 180) + 470), (int) (planet.r * Math.sin(tGrad * Math.PI / 180) + 330), planet.wpl, planet.hpl);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                tGrad = tGrad == 350 ? 0 : tGrad + 0.2;
                i=i==1749? 0 : i+1;
            }
        }
    }

}


//Навесить на окно обработчик события закрытия окна:
//frame.addWindowListener(new WindowAdapter() {
//@Override
//public void windowClosing(WindowEvent e) {
//        // Обработка закрытия окна