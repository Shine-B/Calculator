import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextField extends JTextField{



	public TextField() {
		//�e�L�X�g���E���ɕ\������
		this.setHorizontalAlignment(JTextField.RIGHT);
		//textField��Font���w�肷��B(����,����,32px)�̈Ӗ�
		this.setFont(new Font(Font.SERIF, Font.BOLD, 32));
		//textField�ɃL�[�{�[�h����̓��͂��󂯕t���Ȃ��悤�ɂ���B
		this.setEditable(false);
	}

	public TextField(JPanel textPanel) {
		//�e�L�X�g���E���ɕ\������
		this.setHorizontalAlignment(JTextField.RIGHT);
		//textField��Font���w�肷��B(����,����,32px)�̈Ӗ�
		this.setFont(new Font(Font.SERIF, Font.BOLD, 32));
		//textField�ɃL�[�{�[�h����̓��͂��󂯕t���Ȃ��悤�ɂ���B
		this.setEditable(false);
		//�o���オ����textField��Panel�ɒǉ�����B
		textPanel.add(this);
	}
}
