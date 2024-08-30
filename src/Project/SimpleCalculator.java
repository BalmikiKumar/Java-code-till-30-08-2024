package Project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Calculatorr extends JFrame{
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1,b2,b3,b4;
    Calculatorr(){

        JFrame jFrame=new JFrame();

//        jFrame.setForeground(Color.PINK);
//        jFrame.setBackground(Color.CYAN);
        Container c=jFrame.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.RED);



        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        l1=new JLabel("Functional Calculator");
        l1.setFont(new Font("Times New Roman",Font.BOLD,30));
        l1.setForeground(Color.CYAN);
        l1.setBounds(60,10,300,30);
        add(l1);


        t1=new JTextField(60);
        t2=new JTextField(60);
        b1=new JButton("Add");
        b2=new JButton("Sub");
        b3=new JButton("Mul");
        b4=new JButton("Div");



        t1.setBounds(100,60,120,30);
        t2.setBounds(100,100,120,30);

        b1.setBounds(100,140,60,30);
        b2.setBounds(160,140,60,30);
        b3.setBounds(100,170,60,30);
        b4.setBounds(160,170,60,30);

        l2=new JLabel("Result is here !");
        l2.setBounds(250,80,200,30);
        add(l2);

        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        b1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float no1=Float.parseFloat(t1.getText());
                float no2=Float.parseFloat(t2.getText());
                l2.setText("Add of two no. is "+(no1+no2));
            }
        });

        b2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float no1=Float.parseFloat(t1.getText());
                float no2=Float.parseFloat(t2.getText());
                l2.setText("Sub of two no. is "+(no1-no2));
            }
        });

        b3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float no1=Float.parseFloat(t1.getText());
                float no2=Float.parseFloat(t2.getText());
                l2.setText("Mul of two no. is "+(no1*no2));
            }
        });

        b4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float no1=Float.parseFloat(t1.getText());
                float no2=Float.parseFloat(t2.getText());
                if (no2 !=0){
                    l2.setText("Div of two no. is "+(no1/no2));
                }
                else {
                     l2.setText("Some problem in second num.");
                }




            }
        });




    }

}

public class SimpleCalculator {
    public static void main(String[] args) {
        Calculatorr cal=new Calculatorr();
        cal.setBounds(400,200,400,300);
        cal.setVisible(true);
    }
}
