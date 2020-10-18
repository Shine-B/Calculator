import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class EventHandle implements ActionListener {
	//計算部に必要なフィールドを宣言
	JTextField textField = CalculatorForm.textField;

	//初回の入力処理
	boolean isFirst = true;

	//一つ目の数値
	String num1 = "0";
	//二つ目の数値
	String num2 = "0";

	//ボタンが押された際の数字
	int i = 0;
	//ボタンが押された際の記号
	String symbol;

	四則演算記号 記号 = 四則演算記号.未定義;

	enum 四則演算記号 {
		未定義, 和, 差, 乗, 除, 余
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		btn_Click(e);
		if (symbol.equals("C")) {
			btnClear_Click();
		}
	}

	//ボタンが押された際の処理
	void btn_Click(ActionEvent e) {
		//もしも数値なら、整数型に値を入れる。
		try {
			i = Integer.parseInt(e.getActionCommand());
		}
		//文字列型だった場合は、文字列型に代入する
		catch (Exception exce) {
			symbol = e.getActionCommand();
		}
	}

	void btnClear_Click() {
		textField.setText("0");
		isFirst = true;
	}
}
