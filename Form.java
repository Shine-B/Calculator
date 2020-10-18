import java.awt.LayoutManager;
import java.awt.Rectangle;

import javax.swing.JFrame;

public class Form extends JFrame {
    String title;

    public Form(String title, Rectangle r, LayoutManager layout) {
        super(title);
        this.title = title;

        this.setBounds(r);
        this.setLayout(layout);

        // �t�H�[��������ۂɃN���[�Y������B(������邨���܂�̂��܂��Ȃ��B)
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // ��ʂ����T�C�Y�ł��Ȃ��悤�ɂ���B
        this.setResizable(false);
    }

    public Form(String title, Rectangle r, LayoutManager layout, boolean resize) {
        this(title, r, layout);
        // ��ʂ����T�C�Y�ł��Ȃ��悤�ɂ���B
        this.setResizable(resize);
    }
}