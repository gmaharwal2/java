import java.awt.*;
import java.awt.event.*;

public class Cal implements ActionListener
{
	String n1,n2,n3,n4,n5;
	int op,res;
	TextField t1;
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bmul,bdiv,bdot,beq,bclr;
	
	Cal()
	{
	Frame f=new Frame();

	t1=new TextField();
	b0=new Button("0");
	b1=new Button("1");
	b2=new Button("2");
	b3=new Button("3");
	b4=new Button("4");
	b5=new Button("5");
	b6=new Button("6");
	b7=new Button("7");
	b8=new Button("8");
	b9=new Button("9");
	beq=new Button("=");
	badd=new Button("+");
	bsub=new Button("-");
	bmul=new Button("*");
	bdiv=new Button("/");
	bdot=new Button(".");
	bclr=new Button("clr");
	
	f.setVisible(true);
	f.setSize(300,350);
	f.setLayout(null);
	
	t1.setBounds(30,40,250,30);

	b7.setBounds(40,100,50,40);
	b8.setBounds(100,100,50,40);
	b9.setBounds(160,100,50,40);
	bdiv.setBounds(220,100,50,40);

	b4.setBounds(40,150,50,40);
	b5.setBounds(100,150,50,40);
	b6.setBounds(160,150,50,40);
	bmul.setBounds(220,150,50,40);

	b1.setBounds(40,200,50,40);
	b2.setBounds(100,200,50,40);
	b3.setBounds(160,200,50,40);
	bsub.setBounds(220,200,50,40);

	bdot.setBounds(40,250,50,40);
	b0.setBounds(100,250,50,40);
	beq.setBounds(160,250,50,40);
	badd.setBounds(220,250,50,40);
	
	t1.addActionListener(this);
	b0.addActionListener(this);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	b6.addActionListener(this);
	b7.addActionListener(this);
	b8.addActionListener(this);
	b9.addActionListener(this);
	badd.addActionListener(this);
	bsub.addActionListener(this);
	bmul.addActionListener(this);
	bdiv.addActionListener(this);
	bdot.addActionListener(this);
	bclr.addActionListener(this);
	bclr.setBounds(115,300,50,40);
	
	
	f.add(t1);
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
	f.add(bdot);
	f.add(beq);
	f.add(bclr);
	}

public void actionPerformed(ActionEvent g)
{	

	if(g.getSource()==b0)
	{
	n3=t1.getText();
	n4="0";
	n5=n3+n4;
	t1.setText(n5);
	}
	if(g.getSource()==b1)
	{
	n3=t1.getText();
	n4="1";
	n5=n3+n4;
	t1.setText(n5);
	}
	 if(g.getSource()==b2)
	{
	n3=t1.getText();
	n4="2";
	n5=n3+n4;
	t1.setText(n5);
	}
	if(g.getSource()==b3)
	{
	n3=t1.getText();
	n4="3";
	n5=n3+n4;
	t1.setText(n5);
	}
	if(g.getSource()==b4)
	{
	n3=t1.getText();
	n4="4";
	n5=n3+n4;
	t1.setText(n5);
	}
	if(g.getSource()==b5)
	{
	n3=t1.getText();
	n4="5";
	n5=n3+n4;
	t1.setText(n5);
	}
	if(g.getSource()==b6)
	{
	n3=t1.getText();
	n4="6";
	n5=n3+n4;
	t1.setText(n5);
	}
	if(g.getSource()==b7)
	{
	n3=t1.getText();
	n4="7";
	n5=n3+n4;
	t1.setText(n5);
	}
	 if(g.getSource()==b8)
	{
	n3=t1.getText();
	n4="8";
	n5=n3+n4;
	t1.setText(n5);
	}
	if(g.getSource()==b9)
	{
	n3=t1.getText();
	n4="9";
	n5=n3+n4;
	t1.setText(n5);
	}
	if(g.getSource()==bdot)
	{
	n3=t1.getText();
	n4=".";
	n5=n3+n4;
	t1.setText(n5);
	}
	if(g.getSource()==badd)
	{
	 n1=t1.getText();
	t1.setText("");
	op=1;
	}
	if(g.getSource()==badd)
	{
	 n1=t1.getText();
	t1.setText("");
	op=2;
	}
	if(g.getSource()==bsub)
	{
	 n1=t1.getText();
	t1.setText("");
	op=3;
	}
	if(g.getSource()==bmul)
	{
	n1=t1.getText();
	t1.setText("");
	op=4;
	}
	if(g.getSource()==bdiv)
	{
	 n1=t1.getText();
	t1.setText("");
	op=5;
	}
	if(g.getSource()==beq);
	{
	n2=t1.getText();	
		if(op==1)
		{
			res=Integer.parseInt(n1)+Integer.parseInt(n2);
			t1.setText(String.valueOf(res));
		}	
		else 
		if(op==2)
		{
			res=Integer.parseInt(n1)-Integer.parseInt(n2);
			t1.setText(String.valueOf(res));
		}
		else
		if(op==3)
		{
			res=Integer.parseInt(n1)*Integer.parseInt(n2);
			t1.setText(String.valueOf(res));
		}	
		else
		if(op==4)
		{
			res=Integer.parseInt(n1)/Integer.parseInt(n2);
                        		t1.setText(String.valueOf(res));
                		}
	}
				if (g.getSource()==bclr)
				{
				t1.setText("");
				}
			


}
public static void main(String z[])
{
new Cal();
}
}
	