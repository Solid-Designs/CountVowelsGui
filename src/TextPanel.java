import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel{
    private JTextArea textArea;

    public TextPanel(){
        textArea = new JTextArea();

        new JScrollPane(textArea);

        Dimension dim = textArea.getPreferredSize();
        dim.setSize(300, 150);
        textArea.setPreferredSize(dim);

        setLayout(new BorderLayout());

        add(textArea);

    }

    public void appendText(String text){
        textArea.append(text + "\n");
    }
}
