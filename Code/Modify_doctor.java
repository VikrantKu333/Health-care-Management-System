import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
class Modify_doctor implements ActionListener
{

JFrame jf;
JLabel l1,l2,l3,l4,l5,l6,l7,l8;
JTextField t1,t2,t3,t4,t5,t6,t7;
JButton b1,b2,b3;
Modify_doctor()
{
jf=new JFrame("Update Doctor details");
        jf.setSize(900,650);
        jf.setLocation(450,150);
        jf.setBackground(Color.white);
        jf.setLayout(null);

        JLabel l1 = new JLabel("Enter doctor_id number to update ");
        l1.setBounds(50,100,500,30);
        l1.setFont(new Font("serif",Font.ITALIC,20));
        jf.add(l1);

        t1 = new JTextField();
        t1.setBounds(500,100,200,30);
        jf.add(t1);
         b1 = new JButton("Update");
         b1.setForeground(Color.WHITE);
        b1.setBounds(720,100,100,30);
        jf.add(b1);
        b1.addActionListener(this);
        l2 = new JLabel("Update Doctor Details:");
        l2.setBounds(50,10,500,50);
        l2.setFont(new Font("serif",Font.ITALIC,40));
        l2.setForeground(Color.black);
        jf.add(l2);
		l3= new JLabel("Doctor_id");
        l3.setBounds(50,150,150,30);
      l3.setFont(new Font("serif",Font.BOLD,20));
        jf.add(l3);
        t2=new JTextField();   
        t2.setBounds(200,150,150,30);
        jf.add(t2);


        l4=new JLabel("Doctor_Name");
        l4.setBounds(50,200,150,30);
	l4.setFont(new Font("serif",Font.BOLD,20));
        jf.add(l4);

        t3=new JTextField();   
        t3.setBounds(200,200,150,30);
        jf.add(t3);
		
        l5=new JLabel("working_time");
        l5.setBounds(50,240,150,30);
	l5.setFont(new Font("serif",Font.BOLD,20));
        jf.add(l5);

        t4=new JTextField();   
        t4.setBounds(200,240,150,30);
        jf.add(t4);
		
        l6=new JLabel("Specialization");
        l6.setBounds(50,280,150,30);
	l6.setFont(new Font("serif",Font.BOLD,20));
        jf.add(l6);

        t5=new JTextField();   
        t5.setBounds(200,280,150,30);
        jf.add(t5);
		
		   l7=new JLabel("Dapartment");
        l7.setBounds(50,320,150,30);
	l7.setFont(new Font("serif",Font.BOLD,20));
        jf.add(l7);

        t6=new JTextField();   
        t6.setBounds(200,320,150,30);
        jf.add(t6);
		  l8=new JLabel("Contact_no");
        l8.setBounds(50,360,150,30);
	l8.setFont(new Font("serif",Font.BOLD,20));
        jf.add(l8);

        t7=new JTextField();   
        t7.setBounds(200,360,150,30);
        jf.add(t7);
		
		
		 b2 = new JButton("Submit");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(250,420,150,40);

        jf.add(b2);

        b3=new JButton("Cancel");   
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(450,420,150,40);

        jf.add(b3);

        b2.addActionListener(this);
        b3.addActionListener(this);
		
		
		
		jf.setVisible(true);
}
 public void actionPerformed(ActionEvent ae)
 {
	 if(ae.getSource() == b1){
            try{
                conn con = new conn();
                String str = "select * from doctor where   DOCTORID= '"+t1.getText()+"'";
                ResultSet rs = con.s.executeQuery(str);

                while (rs.next()){
                    //jf.setVisible(true);

                    t2.setText(rs.getString(1));
                    t3.setText(rs.getString(2));
                    t4.setText(rs.getString(3));
                    t5.setText(rs.getString(4));
                    t6.setText(rs.getString(5));
                    t7.setText(rs.getString(6));
				}
				 }catch(Exception ex){}
				
	 }
	 if(ae.getSource()==b2){
            try{
                conn con = new conn();
                String str = " update doctor set  DOCTORID='"+t2.getText()+"',DOCTORNAME='"+t3.getText()+"',WORKINGTIME='"+t4.getText()+"',SPLICALIZATION='"+t5.getText()+"',DEPT='"+t6.getText()+"', CONTACT='"+t7.getText()+"' where  DOCTORID='"+t1.getText()+"'";
                con.s.executeUpdate(str); 
                JOptionPane.showMessageDialog(null,"successfully updated");
                jf.setVisible(false);
                new doctor_list();
            }catch(Exception e){
                System.out.println(e);
            }
	}
			 if(ae.getSource()==b3){
            jf.setVisible(false);
             new MenuBar().jf.setVisible(true);
        }
        
 }
		public static void main(String[] arg)
		{
        new Modify_doctor();
    }
}  