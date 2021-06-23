import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Form2 extends JFrame {
    private JPanel mainPanel;
    private JTextArea allTextArea;
    private JButton OKButton;
    public Form2(String title, ArrayList<String> allStrings) {
        super(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        for (String s: allStrings) {
            writeToTextArea(s);
        }
        this.pack();
        this.setLocationRelativeTo(null);
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closeForm();
            }
        });
    }

    private void writeToTextArea(String text) {
        allTextArea.append(text + "\n");
        allTextArea.update(allTextArea.getGraphics());
    }
    private void closeForm() {
        this.setVisible(false);
    }

    public static void main(String[] args) {
        JFrame frame = new Form2("Form 2", new ArrayList<>());
        frame.setVisible(true);
    }
}
