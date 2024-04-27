package display;
import main.Board;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class submitPanel extends JPanel {
    public submitPanel(Board board) {
        JButton submit = new JButton("Submit");
        JButton reset = new JButton("Reset");

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                board.run();
            }
        });
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                board.reset();
            }
        });

        this.add(submit);
        this.add(reset);
    }
}
