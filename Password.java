//User enter text into TextField
//password is "multimedia"
//use getText to get text from field
//setText to change text to the Label
import java.applet.*;
import java.awt.*;
import java.awt.event.*;  

public class Password extends Applet implements ActionListener{
	String password = "multimedia";
	Button b;
	Label label1,label2, message;
	TextField pass;
	
	public void init(){
		Font font = new Font("Sans Serif", Font.BOLD,14);
		label1 = new Label("Enter text ");
		pass = new TextField(20);
		b = new Button("ENTER");
		b.addActionListener(this);
		message = new Label("");
		message.setFont(font);
		add(label1);
		add(pass);
		add(b);
		add(message);
	}
	
	public void actionPerformed(ActionEvent a) {
		String input = pass.getText();
		if(a.getSource() == b){
			if (input.equals("multimedia")){
				message.setText("Access Accepted");
			}else if(input.length() == 0){
				message.setText("Please insert input.");
			}else{
				message.setText("Access Denied");
			}
		}
	}

}
