import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextField extends JTextField{



	public TextField() {
		//テキストを右側に表示する
		this.setHorizontalAlignment(JTextField.RIGHT);
		//textFieldのFontを指定する。(明朝,太字,32px)の意味
		this.setFont(new Font(Font.SERIF, Font.BOLD, 32));
		//textFieldにキーボードからの入力を受け付けないようにする。
		this.setEditable(false);
	}

	public TextField(JPanel textPanel) {
		//テキストを右側に表示する
		this.setHorizontalAlignment(JTextField.RIGHT);
		//textFieldのFontを指定する。(明朝,太字,32px)の意味
		this.setFont(new Font(Font.SERIF, Font.BOLD, 32));
		//textFieldにキーボードからの入力を受け付けないようにする。
		this.setEditable(false);
		//出来上がったtextFieldをPanelに追加する。
		textPanel.add(this);
	}
}
