  import javax.swing.*;
  import java .awt.*;
   import java .awt. event.*;
  public class doctor_delete implements ActionListener
  {
  JFrame jf;
  JLabel t1;
  JTextField tf;
  JButton b1;
  doctor_delete()
  {
  jf=new JFrame(" doctor delete record");
  t1=new JLabel("ENTER THE DOCTOR ID");
   t1.setBounds(30,40,250,30);
t1.setFont(new Font("serif",Font.ITALIC,20));
tf=new JTextField();
tf.setBounds(290,40,200,30);
b1=new JButton("DELETE");
b1.setBounds(510,40,100,30);
b1.addActionListener(this);
jf.setLayout(null);
jf.add(t1);
jf.add(tf);
jf.add(b1);
   jf.setSize(700,400);
   jf.setVisible(true);
   }
   public void  actionPerformed(ActionEvent ar)
   {
	   conn c1 = new conn();

        if(ar.getSource() == b1){
            try{
                String a = tf.getText();
                String q = "delete from doctor where DOCTORID = '"+a+"'";
                c1.s.executeUpdate(q);
				JOptionPane.showMessageDialog(null,"successfully delete");
                jf.setVisible(false);
                new doctor_list();//.jf.setVisible(true);
            }catch(Exception e){}
		}
   }
   public static void main(String ar[])
   {
   new doctor_delete();
   }
   }