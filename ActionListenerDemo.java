import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.*;
import java.awt.*;


public class ActionListenerDemo extends Frame implements ActionListener {
	TextField textField = new TextField(20);
	Button button;
    private int numClicks=0;
	ActionListenerDemo(){
		//Frame Settings
		setTitle("My First Window");
		setSize(350, 100);
		setVisible(true);
		
		//setting the Layout
		setLayout(new FlowLayout());
		
		button = new Button("Click Me");
		
		//Adding the components in the frame
		add(button);
		add(textField);
        //register the source of event with the listener
        button.addActionListener(this);
	}
    public void actionPerformed(ActionEvent e) {
		numClicks++;
		textField.setText("Button Clicked "+ numClicks+" times");
	}
    public void windowClosing(WindowEvent e){
        dispose();
        System.exit(0);

    }

    

	
public static void main(String[] args) {
		ActionListenerDemo demo = new ActionListenerDemo();

	}

}

