package Project;

import javax.swing.*;
import java.awt.*;


public class Calculator {
     public static void main(String[] args) {
         System.out.println("Calculator");
         JFrame j=new JFrame();
         j.setTitle("Project Calculator");
         j.setVisible(true);
         j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         j.setSize(700,400);
//         j.setLocation(100,50);
         j.setBounds(100,50,700,400);

         Container c=j.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.yellow);

         Font font=new Font("Comic Ms",Font.BOLD,50);

         JLabel label=new JLabel("Functional Calculator");
         label.setBounds(100,50,550,50);
         label.setFont(font);
         c.add(label);


     }
}











/*

package Project;

import javax.swing.*;
import java.awt.*;


public class Calculator {
    JFrame f;
    JTextField t;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bmul,bdiv,bequal,bdel,bdecimal,bclr;

    Calculator(){
        f=new JFrame("Project calculator");
        f.setTitle("Calculator");
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(20,20,1000,1000);

        Font fo=new Font("Arial",Font.BOLD,20);
        t=new JTextField();
        f.add(t);
        t.setFont(fo);
        t.setBackground(Color.YELLOW);
        t.setForeground(Color.RED);
        t.setBounds(40,40,100,50);


//        Container c=f.getContentPane();
//        c.setLayout(null);
//        c.setBackground(Color.pink);


//        t=new JTextField();
//        f.add(t);
//        t.setBackground(Color.WHITE);
//        t.setBounds(40,40,200,50);


        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        badd=new JButton("+");
        bsub=new JButton("-");
        bmul=new JButton("*");
        bdiv=new JButton("/");
        bequal=new JButton("=");
        bdel=new JButton("Del");
        bdecimal=new JButton(".");
        bclr=new JButton("CLR");

        b7.setBounds(40,100,50,40);


        //  f.add(t);

        f.add(b0);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(badd);
        f.add(bsub);
        f.add(bmul);
        f.add(bdiv);
        f.add(bequal);
        f.add(bdecimal);
        f.add(bclr);





    }
    public static void main(String[] args) {
    new Calculator();


    }
}



 */