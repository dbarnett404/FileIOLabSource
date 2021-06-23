import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Welcome extends JFrame {
    private JPanel mainPanel;
    private JButton form1Button;
    private JButton form2Button;

    public Welcome(String title, ArrayList<String> allStrings) {
        super(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        this.setLocationRelativeTo(null);

        form1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Form1 form1 = new Form1("Form 1", allStrings);
                form1.setVisible(true);
            }
        });
        form2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Form2 form2 = new Form2("Form 2", allStrings);
                form2.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new Welcome("Welcome Form", new ArrayList<>());
        frame.setVisible(true);
    }

}
