import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class payment_option implements ActionListener{
JFrame fr;
JLabel l1;
JButton b1,b2;
 
 payment_option()
{
 fr=new JFrame("PAYMENT OPTION");
 l1=new JLabel("PAYMENT OPTION");
l1.setFont(new Font("serif",Font.BOLD,25));
 l1.setBounds(110,50,250,40);
 fr.add(l1);
b1=new JButton("DEBIT CARD");
b1.setBounds(70,110,140,40);
b1.setFont(new Font("serif",Font.ITALIC,15));
fr.add(b1);

 b2=new JButton("CREDIT CARD");
 b1.addActionListener(this);
b2.setBounds(230,110,140,40);
b2.setFont(new Font("serif",Font.ITALIC,15));
 b2.addActionListener(this);
fr.add(b2);

fr.setLayout(null);
fr.setSize(500,400);
fr.setVisible(true);
}

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
 {
    fr.setVisible(false);
     new WardS();

 }


if(ae.getSource()==b2)
 {
    fr.setVisible(false);
     new StaffS();

 }

}
public static void main(String ar[])
{
 new payment_option();
}
}