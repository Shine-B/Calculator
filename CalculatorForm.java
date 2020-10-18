import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class CalculatorForm extends JFrame{

	// Declaration Field
	public Form form;

	static public JTextField textField;

	Button btn0;
	Button btn1;
	Button btn2;
	Button btn3;
	Button btn4;
	Button btn5;
	Button btn6;
	Button btn7;
	Button btn8;
	Button btn9;
	Button btn00;

	Button btnadd;
	Button btnsub;
	Button btnmal;
	Button btndiv;

	Button btnpar;
	Button btncan;
	Button btndot;
	Button btnequ;

	public CalculatorForm() {
		// --------------------- Create Window ---------------------//

		// Call the newForm 
		// hikisu => ("StringTitle,Size(StartPosition.x,StartPosition.y, Width , Height ),LayoutOption)
		form = new Form("ìdëÏ", new Rectangle(100, 100, 600, 600), new BorderLayout());

		//---------------------- Create Panel Area----------------------//
		// Create Panel for TextField
		// hikisu => (BackgroundColor,size(StartPosition.x,StartPosition.y, Width , Height ),Targetform,LayoutOption)
		Panel textPanel = new Panel(new Color(255, 255, 0, 100),
						   new Dimension(form.getWidth(), 100),
						   form,
						   BorderLayout.PAGE_START);

		// Create Panel to Display ButtonField
		// hikisu => (BackgroundColor,Targetform,LayoutOption)
		Panel buttonPanel = new Panel(Color.BLUE, form, BorderLayout.CENTER);
		//----------------------- Create TextPanel ----------------------//
		// This time,TextPanel is add the TextBox only.
		// Used CardDisplay to all Display Panel
		// hikisu => (LayoutClass(Horizontal MarginÅAVertical Margin))
		textPanel.setLayout(new CardLayout(40, 20));
		// hikisu =>(PiarentCompornent)
		textField = new TextField(textPanel);

		//------------------------- Create Button ---------------------------//

		//Disigner Button 
		buttonPanel.setLayout(null);
		btn7 = new Button("7", new Rectangle(50, 50, 75, 75), buttonPanel);
		btn8 = new Button("8", new Rectangle(150, 50, 75, 75), buttonPanel);
		btn9 = new Button("9", new Rectangle(250, 50, 75, 75), buttonPanel);
		btnadd = new Button("+", new Rectangle(350, 50, 75, 75), buttonPanel);
		btnsub = new Button("-", new Rectangle(450, 50, 75, 75), buttonPanel);

		btn4 = new Button("4", new Rectangle(50, 150, 75, 75), buttonPanel);
		btn5 = new Button("5", new Rectangle(150, 150, 75, 75), buttonPanel);
		btn6 = new Button("6", new Rectangle(250, 150, 75, 75), buttonPanel);
		btnmal = new Button("Å~", new Rectangle(350, 150, 75, 75), buttonPanel);
		btndiv = new Button("ÅÄ", new Rectangle(450, 150, 75, 75), buttonPanel);

		btn1 = new Button("1", new Rectangle(50, 250, 75, 75), buttonPanel);
		btn2 = new Button("2", new Rectangle(150, 250, 75, 75), buttonPanel);
		btn3 = new Button("3", new Rectangle(250, 250, 75, 75), buttonPanel);
		btnpar = new Button("%", new Rectangle(350, 250, 75, 75), buttonPanel);
		btndot = new Button(".", new Rectangle(450, 250, 75, 75), buttonPanel);

		btn0 = new Button("0", new Rectangle(50, 350, 75, 75), buttonPanel);
		btn00 = new Button("00", new Rectangle(150, 350, 75, 75), buttonPanel);
		btnequ = new Button("=", new Rectangle(250, 350, 75, 75), buttonPanel);
		btncan = new Button("C", new Rectangle(350, 350, 75, 75), buttonPanel);


		//------------------ lastTime enable Display Setting----------------------//
		form.setVisible(true);
	}
}