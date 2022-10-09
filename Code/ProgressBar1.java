import javax.swing.*;
import java.awt.*;
public class ProgressBar1
{
	JFrame jf;
JProgressBar jp;
int i=0;
ProgressBar1()
{
jf=new JFrame("Hospital Mangement");
ImageIcon c1 = new ImageIcon("icons\\first.jpg");
Image im = c1.getImage().getScaledInstance(800, 800,Image.SCALE_DEFAULT);
ImageIcon c2=new ImageIcon(im);
JLabel jl=new JLabel(c2);
jl.setBounds(0,0,800,600);
jf.add(jl);
jp=new JProgressBar(0,2000);
jp.setBounds(0,570,790,40);
jp.setValue(0);
jp.setStringPainted(true);
jf.setLayout(null);
jf.add(jp);
 jf.setSize(780,650);
 jf.setVisible(true);
}
public void iterate()
{
while(i<=2000)
{
jp.setValue(i);
i=i+25;
try
{
Thread.sleep(100);
}catch(Exception ex)
{}
}
jf.setVisible(false);
new Logine();
}
public static void main(String ar[])
{
ProgressBar1 pb=new ProgressBar1();
pb.iterate();
}
}