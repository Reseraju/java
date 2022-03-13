import java.awt.*;
import java.awt.event.*;
import java.awt.Checkbox;
import java.awt.TextField;
import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;


public class SignUpForm extends Frame implements  ActionListener {
TextField name = new TextField(20);
TextField mobile = new TextField(20);
TextField addressField = new TextField(40);
Checkbox maleCheckbox,femaleCheckbox;
Button btn = new Button("Submit");
Label label;


public SignUpForm(){
    //frame settings
    setTitle("Sign Up");
    setVisible(true);
    setLayout(new FlowLayout(FlowLayout.LEFT));
    
    

    //adding components in the frame
    add(new Label("Name    : "));
    add(name);
    
    add(new Label("Mobile    :"));
    add(mobile);
    
    add(new Label("Address    :"));
    add(addressField);
    
    
    add(new Label("Gender :"));
    maleCheckbox = new Checkbox("male");
    add(maleCheckbox);

    femaleCheckbox = new Checkbox("female");
    add(femaleCheckbox);

    add(btn);
    //register the sources of event with the listener
    btn.addActionListener(this);
    setBounds(100,100,250,300);
    
}

public void actionPerformed(ActionEvent e){
    System.out.println("\nDetails");
    System.out.println("Name : "+name.getText());
    System.out.println("Mobile : "+mobile.getText());
    System.out.println("Address : "+addressField.getText());

    if(e.getSource()==maleCheckbox){
        boolean isChecked = maleCheckbox.getState();
        if(isChecked){
            System.out.println("Gender : Male");
        }
        
    }
    else{
        boolean isChecked = femaleCheckbox.getState();
        if(isChecked){
            System.out.println("Gender : Female");
            
        }
        
    }
    
    
}
    public static void main(String[] args) {
        new SignUpForm();
    }
}
