import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class EventHandle implements ActionListener {
	//�v�Z���ɕK�v�ȃt�B�[���h��錾
	JTextField textField = CalculatorForm.textField;

	//����̓��͏���
	boolean isFirst = true;

	//��ڂ̐��l
	String num1 = "0";
	//��ڂ̐��l
	String num2 = "0";

	//�{�^���������ꂽ�ۂ̐���
	int i = 0;
	//�{�^���������ꂽ�ۂ̋L��
	String symbol;

	�l�����Z�L�� �L�� = �l�����Z�L��.����`;

	enum �l�����Z�L�� {
		����`, �a, ��, ��, ��, �]
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		btn_Click(e);
		if (symbol.equals("C")) {
			btnClear_Click();
		}
	}

	//�{�^���������ꂽ�ۂ̏���
	void btn_Click(ActionEvent e) {
		//���������l�Ȃ�A�����^�ɒl������B
		try {
			i = Integer.parseInt(e.getActionCommand());
		}
		//������^�������ꍇ�́A������^�ɑ������
		catch (Exception exce) {
			symbol = e.getActionCommand();
		}
	}

	void btnClear_Click() {
		textField.setText("0");
		isFirst = true;
	}
}
