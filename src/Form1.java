import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Form1 extends JFrame {
    private JPanel mainPanel;
    private JTextField inputTextField;
    private JButton OKButton;

    public Form1(String title, ArrayList<String> allStrings) {
        super(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        this.setLocationRelativeTo(null);

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textEntered(allStrings);
            }
        });
    }

    private void textEntered(ArrayList<String> allStrings) {
        allStrings.add(inputTextField.getText());
        //SAVE - WRITE FILE GOES HERE FileIO.fileName
        this.setVisible(false);
    }

    public static void main(String[] args) {
        JFrame frame = new Form1("Form 1", new ArrayList<>());
        frame.setVisible(true);
    }
}
