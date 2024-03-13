import java.awt.FLowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class TextFieldFrame extends Jframe{
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPasswordField passwordField;
    
    public TextFieldFrame(){
        super("Testing JTextField and JPasswordField");
        setLayout (new Flowlayout());
        
        textField1 = new JTextField(10);
        add( textField1 );
        
        textField2 = new JTextField("Enter text here");
        add( textField2 );
        
        textField3 = new JTextField("uneditable text field", 21); 
        textFIeld3.setEditable( false );
        add( textField3 );
        
        passwordField = new JPasswordField("hidden text");
        add( passwordFIeld );
        
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }
    private class TextFieldHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            String string = "";
            if(event.getSource() == textField1)
                string = String.format("textField1:%s", event.getActionCommand());
            
            else if (event.getSource() == textField2)
                string = String.format("textField2:%s", event.getActionCommand());
            else if (event.getSource() == textField3)
                string = String.format("textFIeld3: %s", event.getActionCommand());          
            else if (event.getSource() == passwordFIeld)
                string = String.format("passwordFIeld: %s", event.getActionCommand());
            JOptionPane.showMessageDialog(null, string);
        }
    }
}
