import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MenuBar implements ActionListener

{
JFrame jf;
JMenu ja,js,jm,jd,jr,je,jl,jh;
JMenuItem jmd,jmp,jms,jmw,jmh,jsd,jsp,jss,jsw,jsh,jad,jap,jas,jaw,jah,jdd,jdp,jds,jdw,jdh,jhh,jld,jlp,jls,jlw;
MenuBar()
{
jf=new JFrame("RAM Hospital");
JMenuBar mb= new JMenuBar();
ja=new JMenu("Add");
js=new JMenu("Search");
jm=new JMenu("Modify");
jd=new JMenu("Delete");
jr=new JMenu("Report");
jl=new JMenu("list");
jh=new JMenu("help");
je=new JMenu("Exit");
mb.add(ja);
mb.add(js);
mb.add(jm);
mb.add(jd);
mb.add(jr);
mb.add(jl);
mb.add(jh);
mb.add(je);
jf.setJMenuBar(mb);
// ADD
jmd=new JMenuItem("Doctor");
jmd.addActionListener(this);
jmp=new JMenuItem("Patient");
jmp.addActionListener(this);
jms=new JMenuItem("Staf");
jms.addActionListener(this);
jmw=new JMenuItem("Ward");
jmw.addActionListener(this);
jmh=new JMenuItem("Hospital");
jmh.addActionListener(this);
ja.add(jmd);
ja.add(jmp);
ja.add(jms);
ja.add(jmw);
ja.add(jmh);
//SEARCH
jsd=new JMenuItem("Doctor");
jsd.addActionListener(this);
jsp=new JMenuItem("Patient");
jsp.addActionListener(this);
jss=new JMenuItem("Staf");
jss.addActionListener(this);
jsw=new JMenuItem("Ward");
jsw.addActionListener(this);
//jsh=new JMenuItem("Hospital");
js.add(jsd);
js.add(jsp);
js.add(jss);
js.add(jsw);
//js.add(jsh);
//MODIFY
jad=new JMenuItem("Doctor");
jad.addActionListener(this);
jap=new JMenuItem("Patient");
jap.addActionListener(this);
jas=new JMenuItem("Staf");
jas.addActionListener(this);
jaw=new JMenuItem("Ward");
jaw.addActionListener(this);
//jah=new JMenuItem("Hospital");
jm.add(jad);
jm.add(jap);
jm.add(jas);
jm.add(jaw);
//m.add(jah);
//DLEATE
jdd=new JMenuItem("Doctor");
jdp=new JMenuItem("Patient");
jds=new JMenuItem("Staf");
jdw=new JMenuItem("Ward");
//jdh=new JMenuItem("Hospital");
jd.add(jdd);
jdd.addActionListener(this);
jd.add(jdp);
jdp.addActionListener(this);
jd.add(jds);
jds.addActionListener(this);
jd.add(jdw);
jdw.addActionListener(this);
//jd.add(jdh);
//list
jld=new JMenuItem("Doctor");
jld.addActionListener(this);
jlp=new JMenuItem("Patient");
jlp.addActionListener(this);
jls=new JMenuItem("Staf");
jls.addActionListener(this);
jlw=new JMenuItem("Ward");
jlw.addActionListener(this);
jl.add(jld);
jl.add(jlp);
jl.add(jls);
jl.add(jlw);
//ABOUT
jhh=new JMenuItem("ABOUT");
jh.add(jhh);
jhh.addActionListener(this);


ImageIcon c1 = new ImageIcon("icons\\thired.jpg");
Image im = c1.getImage().getScaledInstance(800,800,Image.SCALE_DEFAULT);
ImageIcon c2=new ImageIcon(im);
JLabel jl=new JLabel(c2);
jf.add(jl);
jf.setLayout(null);
jf.setSize(800,800);
jf.setVisible(true);
}
public void actionPerformed(ActionEvent ae)
//ADD 
{
if(ae.getSource()==jmd)
{
new Doctor();
}
else if(ae.getSource()==jmp)
{
	new Patient();
}
else if(ae.getSource()==jms)
{
	new Staff();
}
else if(ae.getSource()==jmw)
{
	new ward();
}
else if(ae.getSource()==jmh)
{
	new Hospital();
}
//SEARCH
else if(ae.getSource()==jsd)
{
new DoctorS();
}
else if(ae.getSource()==jsp)
{
	new PatientS();
}
else if(ae.getSource()==jss)
{
	new StaffS();
}
else if(ae.getSource()==jsw)
{
	new WardS();
}
//ABOUT
else if(ae.getSource()==jhh)
{
	new about();
}
//LIST
else if(ae.getSource()==jld)
{
	new doctor_list();
}
else if(ae.getSource()==jlp)
{
	new Patient_list();
}
else if(ae.getSource()==jls)
{
	new Staff_list();
}
else if(ae.getSource()==jlw)
{
	new ward_list();
}
//MODIFY
else if(ae.getSource()==jad)
{
	new Modify_doctor();
}
else if(ae.getSource()==jap)
{
	new Modify_Patient();
}
else if(ae.getSource()==jas)
{
	new Modify_Staff();
}
else if(ae.getSource()==jaw)
{
	new Modify_ward();
}
//DELETE
else if(ae.getSource()==jdd)
{
	new doctor_delete();
}
else if(ae.getSource()==jdp)
{
	new Patient_delete();
}
else if(ae.getSource()==jds)
{
	new Staff_delete();
}
else if(ae.getSource()==jdw)
{
	new Ward_delete();
}
//Exit
else if(ae.getSource()==jh)
{
System.exit(0);  	
}
}
public static void main(String ar[])
{
new MenuBar();
}
}