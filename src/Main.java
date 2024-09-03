import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner t = new Scanner(System.in);
        System.out.println("Ввод (1 -движение по прямой, 2 -по квадрату, 3-произвольно,  0 -выход ) :");
        int x = t.nextInt();
        if (x == 1) {
            JFrame Okno = new JFrame("Движение");
            Design d1 = new Design();
            Okno.add(d1);
            Okno.setBounds(0, 0, 600, 600);
            Okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Okno.setResizable(true);
            Okno.setLocationRelativeTo(null);
            Okno.setVisible(true);
            Okno.setAlwaysOnTop(true);
        }
        if (x == 2) {
            JFrame Okno = new JFrame("Ходим по квадрату");
            Design2 d2=new Design2();
            Okno.add(d2);
            Okno.setBounds(0,0,500,500);
            Okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Okno.setResizable(true);
            Okno.setLocationRelativeTo(null);
            Okno.setVisible(true);
            Okno.setAlwaysOnTop(true);
        }
        if (x==3) {
            JFrame Okno = new JFrame("Хаотичненько  DOLBY DIGITAL");
            Design3 d3=new Design3();

            Okno.setBounds(0,0,600,400);
            Okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Okno.setResizable(false);
            Okno.setLocationRelativeTo(null);
            Okno.setVisible(true);
            Okno.setAlwaysOnTop(true);
            Okno.getContentPane().setBackground(Color.CYAN);
            Okno.add(d3);
        }
        if (x == 0) {  System.out.println(" #Этоконец# "); }
    }
}
