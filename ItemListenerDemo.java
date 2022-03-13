import java.awt.Frame;
import java.awt.Checkbox;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemListenerDemo extends Frame implements ItemListener{
    Checkbox checkbox1 , checkbox2;
    Label label;
    public ItemListenerDemo(){
        //Frame settings
        setTitle("Checkbox Demo");
        setSize(400,400);
        setLayout(null);
        setVisible(true);

        //Label settings
        label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(400,100);
        add(label);


        checkbox1 = new Checkbox("C++");
        checkbox1.setBounds(100,100,50,50);
        add(checkbox1);

        checkbox2 = new Checkbox("Java");
        checkbox2.setBounds(100, 150, 50, 50);
        add(checkbox2);

        checkbox1.addItemListener(this);
        checkbox2.addItemListener(this);

    }

public void itemStateChanged(ItemEvent e){
    if(e.getSource()==checkbox1){
        boolean isChecked = checkbox1.getState();
        if(isChecked){
            label.setText("C++ checkbox Checked");
        }
        else{
            label.setText("C++ checkbox Unchecked");
        }
        
    }
    else{
        boolean isChecked = checkbox2.getState();
        if(isChecked){
            label.setText("java checkbox Checked");
        }
        else{
            label.setText("java checkbox Unchecked");
        }
    }
}

    public static void main(String[] args) {
        new ItemListenerDemo();
    }

    
    
}
