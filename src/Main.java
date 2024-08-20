import javax.swing.*;

public class Main {

    public static void main(String[] args) throws Exception  {
        JFrame Okno = new JFrame("Движение");
        Design d1=new Design();
        Okno.add(d1);
        Okno.setBounds(0,0,600,600);
        Okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Okno.setResizable(true);
        Okno.setLocationRelativeTo(null);
        Okno.setVisible(true);
    }



}
