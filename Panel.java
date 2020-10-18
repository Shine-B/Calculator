import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel extends JPanel{

	JPanel panel;
	Dimension size;
	Color backGround_Color;
	LayoutManager layOut;

	public Panel( Color backGround_Color){
		this.panel = new JPanel();
		this.backGround_Color = backGround_Color;
		this.setBackground(backGround_Color);
	}

	public Panel( Color backGround_Color,Dimension size){
		this(backGround_Color);
		this.setPreferredSize(size);
	}

	public Panel( Color backGround_Color,JFrame addForm,String MySelfLayout){
		this(backGround_Color);
		addForm.add(this,MySelfLayout);
	}

	public Panel( Color backGround_Color,Dimension size,JFrame addForm,String MySelfLayout){
		this(backGround_Color,addForm,MySelfLayout);
		this.setPreferredSize(size);
	}
}
