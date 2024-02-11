import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileNewActionListener implements ActionListener {
    private final JTextArea textArea;

    public FileNewActionListener(JTextArea ta) {
        this.textArea = ta;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        textArea.setVisible(true);
    }
}
