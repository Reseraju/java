import java.awt.*;
import java.awt.Frame;
import java.awt.event.*;

public class calcDemo extends Frame implements ActionListener  {
    TextField textField = new TextField(80);
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Button add,sub,multi,div,equal,c;
    String s,s1,s2,s3,s4;
    int number1,number2,result;
    Frame f;

    calcDemo(){
        f = new Frame("My calculator");
        f.setSize(400,540);
        f.setLayout(null);
        f.setVisible(true);

        f.add(textField);
        textField.setBounds(50,50,200,50);
        b1= new Button("1");
		f.add(b1);
		b1.setBounds(50,340,50,50);

        b2= new Button("2");
		f.add(b2);
		b2.setBounds(120,340,50,50);

		b3= new Button("3");
		b3.setBounds(190,340,50,50);
		f.add(b3);

		add= new Button("+");
	    add.setBounds(250,200,50,50);
		f.add(add);

		b4= new Button("4");
		f.add(b4);
		b4.setBounds(50,270,50,50);

		b5= new Button("5");
		f.add(b5);
		b5.setBounds(120,270,50,50);

		b6= new Button("6");
		f.add(b6);
		b6.setBounds(190,270,50,50);

		sub = new Button("-");
		sub.setBounds(250,270,50,50);
		f.add(sub);

		b7= new Button("7");
		f.add(b7);
		b7.setBounds(50,200,50,50);

		b8= new Button("8");
		f.add(b8);
		b8.setBounds(120,200,50,50);
		
		b9= new Button("9");
		f.add(b9);
		b9.setBounds(190,200,50,50);

		multi = new Button("*");
		f.add(multi);
		multi.setBounds(250,340,50,50);

		b0 = new Button("0");
		f.add(b0);
		b0.setBounds(120,400,50,50);
		
		
		div = new Button("/");
		f.add(div);
		div.setBounds(50,400,50,50);

		equal = new Button("=");
		f.add(equal);
		equal.setBounds(250,400,50,50);

        c= new Button("C");
		f.add(c);
		c.setBounds(190,400,50,50);

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

        add.addActionListener(this);
        sub.addActionListener(this);
        multi.addActionListener(this);
        div.addActionListener(this);
        c.addActionListener(this);
        equal.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        s=e.getActionCommand();
        if(s.equals("0")||s.equals("1")||s.equals("2")||s.equals("3")||s.equals("4")||s.equals("5")||s.equals("6")||s.equals("7")||s.equals("8")||s.equals("9")){
            s1=textField.getText()+s;
            textField.setText(s1);
        }
        if(s.equals("+")){
            s2=textField.getText();
            textField.setText("");
            s3="+";
        }
        if(s.equals("-")){
            s2=textField.getText();
            textField.setText("");
            s3="-";
        }
        if(s.equals("*")){
            s2=textField.getText();
            textField.setText("");
            s3="*";
        }
        if(s.equals("/")){
            s2=textField.getText();
            textField.setText("");
            s3="/";
        }
        if(s.equals("=")){
            s4=textField.getText();
            number1=Integer.parseInt(s2);
            number2=Integer.parseInt(s4);
            if(s3.equals("+")){
                result=number1+number2;
            }
            if(s3.equals("-")){
                result=number1-number2;
            }
            if(s3.equals("*")){
                result=number1*number2;
            }
            if(s3.equals("/")){
                result=number1/number2;
            }
            textField.setText(String.valueOf(result));
        }
        if(s.equals("C")){
            textField.setText("");
        }
    }
    

    public static void main(String[] args) {
        new calcDemo();
    }
}
