import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Button extends JButton {

    JButton button;

    public Button() {

        this.button = new JButton("Button");
        this.setFont(new Font(null, 0, 32));
        this.addActionListener(new EventHandle());
        this.setActionCommand(this.getText());
    }

    public Button(String text) {
        this();
        this.setText(text);
        this.setName(text);

    }

    public Button(String text, int width, int height) {
        this();
        this.setPreferredSize(new Dimension(width, height));
    }

    public Button(String text, Dimension size) {
        this(text);
        this.setSize(size);
    }

    public Button(String text, Rectangle r, JPanel panel) {
        this(text);
        this.setBounds(r);
        panel.add(this);
    }

    public Button(String text, Dimension size, JPanel panel) {
        this(text, size);
        panel.add(this);
    }
}
