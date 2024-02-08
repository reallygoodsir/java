import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileNewActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JDialog newDialogue = new JDialog();
        newDialogue.setTitle("New Dialogue");
        newDialogue.setLocation(700, 350);
        newDialogue.setSize(400, 225);
        newDialogue.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        newDialogue.setVisible(true);
    }
}
