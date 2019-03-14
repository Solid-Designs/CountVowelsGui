import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/* This program will count the vowel in a string and then
append it to the text area */

public class MainFrame extends JFrame{
    // Declare components here:
    private TextPanel textPanel;
    private FormPanel formPanel;

    public MainFrame(){
        super("Count Vowels");

        textPanel = new TextPanel();
        formPanel = new FormPanel();

        setLayout(new BorderLayout());

        add(textPanel, BorderLayout.NORTH);
        add(formPanel, BorderLayout.SOUTH);

        formPanel.setListener(new StringListener() {
            @Override
            public void textEmitted(String text) {
                textPanel.appendText(text);
            }
        });

        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
