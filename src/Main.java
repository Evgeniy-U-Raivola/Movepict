import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner t = new Scanner(System.in);
        System.out.println("");
        System.out.println("Меню: 1 -движение по прямой, 2 -по квадрату, 3-произвольно/смена цвета,");
        System.out.println("      4 -земля вокруг солнца, 5 - солнечная система)");
        System.out.println("      0 - ВЫХОД :");

        int x = t.nextInt();
        while (x!=0) {
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
            if (x==4) {
                JFrame Okno = new JFrame("Земля,Земля, я Юпитер");
                Solaris s1=new Solaris();

                Okno.setBounds(0,0,800,700);
                Okno.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Okno.setResizable(false);
                Okno.setLocationRelativeTo(null);
                Okno.setVisible(true);
                Okno.setAlwaysOnTop(true);
                Okno.getContentPane().setBackground(Color.BLACK);
                Okno.add(s1);
            }
            if (x==5) {
                JFrame Okno = new JFrame(" Солнечная система");
                SolarSystem s2=new SolarSystem();

                Okno.setBounds(0,0,1000,800);
                Okno.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Okno.setLocationRelativeTo(null);
                Okno.setResizable(false);
                Okno.setVisible(true);
                Okno.setAlwaysOnTop(true);
                Okno.getContentPane().setBackground(Color.BLACK);
                Okno.add(s2);

            }
            x = t.nextInt();
        }
        System.out.println("                                #ЭТОКОНЕЦ# ");
        System.exit(0);
    }
}
