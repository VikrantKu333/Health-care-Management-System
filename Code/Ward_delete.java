  import javax.swing.*;
  import java .awt.*;
   import java .awt. event.*;
  public class Ward_delete implements ActionListener
  {
  JFrame jf;
  JLabel t1;
  JTextField tf;
  JButton b1;
  Ward_delete()
  {
 jf=new JFrame(" ward delete record");
 t1=new JLabel("ENTER THE Ward ID");
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
                String q = "delete from WARD where  Word_no = '"+a+"'";
                c1.s.executeUpdate(q);
				JOptionPane.showMessageDialog(null,"successfully delete");
                jf.setVisible(false);
                new ward_list();//.jf.setVisible(true);
            }catch(Exception e){}
		}
   }
   public static void main(String ar[])
   {
   new Ward_delete();
   }
   } 