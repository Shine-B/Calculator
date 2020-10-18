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

        // フォームを閉じた際にクローズさせる。(毎回入るお決まりのおまじない。)
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 画面をリサイズできないようにする。
        this.setResizable(false);
    }

    public Form(String title, Rectangle r, LayoutManager layout, boolean resize) {
        this(title, r, layout);
        // 画面をリサイズできないようにする。
        this.setResizable(resize);
    }
}