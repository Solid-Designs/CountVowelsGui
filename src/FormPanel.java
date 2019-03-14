import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPanel extends JPanel implements ActionListener {
    private JTextField textField;
    private JButton submitButton;
    private StringListener listener;

    public FormPanel(){
        textField = new JTextField("", 20);
        submitButton = new JButton("Submit");

        submitButton.addActionListener(this);

        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();

        // Text Field
        gc.gridx = 1;
        gc.gridy = 0;
        gc.weightx = 1;
        gc.weighty = 2.0;
        gc.fill = GridBagConstraints.NONE;
        add(textField, gc);

        // Submit Button
        gc.gridx = 1;
        gc.gridy = 1;
        gc.weightx = 1;
        gc.weighty = 2.0;
        gc.fill = GridBagConstraints.NONE;
        add(submitButton, gc);
    }

    public String calculate(String text){
        int numOfVowels = 0;
        String inputText = text.toLowerCase();
        String outputText;

        for(int i = 0; i < inputText.length(); i++) {
            if((inputText.charAt(i) == 'a') || (inputText.charAt(i) == 'e')
            || (inputText.charAt(i) == 'i') || (inputText.charAt(i) == 'o')
            || (inputText.charAt(i) == 'u')){
                numOfVowels += 1;
            }
        }

        if(numOfVowels > 0){
            outputText = "There are: " + numOfVowels + " vowels in this string";
        }else{
            outputText = "There are no vowels on this string";
        }

        return outputText;
    }

    public void setListener(StringListener listener){
        this.listener = listener;
    }

    public void actionPerformed(ActionEvent e){
        String inputString = textField.getText();
        String outputString = calculate(inputString);

        if(listener != null){
            listener.textEmitted(outputString);
        }
    }

}
