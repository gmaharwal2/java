import java.awt.*;
import java.awt.event.*;
public class Tmn1 implements ActionListener
{
TextField t,t1;
Button b;
Tmn1()
{
Frame f=new Frame();

Label l=new Label("Enter a Value:");
l.setBounds(5,100,80,20);
f.add(l);

t=new TextField();
t.setBounds(100,100,50,20);
f.add(t1);

Label l1=new Label("Result:");
l1.setBounds(5,150,80,20);
f.add(l1);

t1=new TextField();
t1.setBounds(100,150,50,20);
f.add(t1);

b=new Button("FAct:");
b.setBounds(50,250,50,20);
b.addActionListener(this);

f.add(b);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}

public void actionPerformed(ActionEvent e)
{
int fact;
String s1=t.getText();
int a=Integer.parseInt(s1);
for(fact=1;a>0;a--)
fact=fact*a;
String s2=String.valueOf(fact);
t1.setText(s2);
}
public static void main(String s[])
{
Tmn1 tm=new Tmn1();
}
}

