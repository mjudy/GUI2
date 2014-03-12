import com.sun.tools.javac.comp.Flow;

import java.awt.*;
import javax.swing.*; // for JOptionPane

public class FlippedGUI2 extends JPanel
{

    // ADD YOUR GUI COMPONENTS HERE
    /*JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();


    JButton jb1 = new JButton("Configure");
    JButton jb2 = new JButton("Save");
    JButton jb3 = new JButton("Related Software");
    JButton jb4 = new JButton("Quit");*/

//    JPanel panel4 = new JPanel();
//    JPanel panel5 = new JPanel();
//
//    JButton jb5 = new JButton("Players Online");
//    JButton jb6 = new JButton("Make Admin");
//    JButton jb7 = new JButton("Make Mod");
//    JButton jb8 = new JButton("Yell");
//    JButton jb9 = new JButton("Names of All Players Online");
//    JButton jb0 = new JButton("Kick All Online Users");
//
//    JTextField jt1 = new JTextField();
//    JTextField jt2 = new JTextField();
//    JTextField jt3 = new JTextField();
//
//    JLabel jl1 = new JLabel("0 players online");

    JPanel panelA = new JPanel();
    JPanel panelB = new JPanel();
    JPanel panelC = new JPanel();
    JPanel panelD = new JPanel();

    JButton jbA = new JButton("On");
    JButton jbB = new JButton("Off");
    JButton jbC = new JButton("On");
    JButton jbD = new JButton("Off");
    JButton jbE = new JButton("About", new ImageIcon("AkerStar.png"));
    JButton jbF = new JButton("Preferences", new ImageIcon("AkerTools.png"));
    JButton jbG = new JButton("OK", new ImageIcon("AkerCheck.png"));

    JLabel jlA = new JLabel("Bluetooth Radio:");
    JLabel jlB = new JLabel("Wireless Radio:");

    JLabel icon = new JLabel(new ImageIcon("AkerLeftIcon.png"));

    // ADD YOUR CONSTRUCTOR HERE
    public FlippedGUI2()
    {
//        panel1.setBorder(BorderFactory.createTitledBorder("Configure X-Bone GUI"));
//        panel2.setBorder(BorderFactory.createTitledBorder("Configure Related Software"));
//        panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10));
//        panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10));
//        panel3.setLayout(new FlowLayout(FlowLayout.CENTER));
//        panel1.add(jb1);
//        panel1.add(jb2);
//        panel2.add(jb3);
//        panel3.add(jb4);
//        this.setPreferredSize(new Dimension(292, 209));
//        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
//        this.add(panel1);
//        this.add(panel2);
//        this.add(panel3);

//        panel4.setLayout(new GridLayout(4, 2, 10, 15));
//        panel5.setLayout(new GridLayout(2, 1, 0, 1));
//
//        panel4.setBorder(BorderFactory.createEmptyBorder(0, 0, 15, 0));
//        this.setBorder(BorderFactory.createEmptyBorder(10, 5, 5, 5));
//        panel4.add(jb5);
//        panel4.add(jl1);
//        panel4.add(jb6);
//        panel4.add(jt1);
//        panel4.add(jb7);
//        panel4.add(jt2);
//        panel4.add(jb8);
//        panel4.add(jt3);
//        panel5.add(jb9);
//        panel5.add(jb0);
//        this.setPreferredSize(new Dimension(275, 263));
//        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
//        this.add(panel4);
//        this.add(panel5);

        panelA.add(icon);

        jlA.setHorizontalTextPosition(JLabel.RIGHT);
        jlB.setHorizontalTextPosition(JLabel.RIGHT);

        panelB.setLayout(new GridLayout(2, 3, 5, 10));
        panelB.add(jlA);
        panelB.add(jbA);
        panelB.add(jbB);
        panelB.add(jlB);
        panelB.add(jbC);
        panelB.add(jbD);

        panelC.setLayout(new GridLayout(1, 3, 10, 10));
        jbE.setPreferredSize(new Dimension(75, 10));
        panelC.add(jbE);
        panelC.add(jbF);
        panelC.add(jbG);

        panelD.setLayout(new BoxLayout(panelD, BoxLayout.X_AXIS));
        panelD.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));
        panelD.add(panelA);
        panelD.add(panelB);

        this.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        this.setPreferredSize(new Dimension(400, 181));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(panelD);
        this.add(panelC);
    }
    // ADD YOUR ACTIONLISTENER HERE

}