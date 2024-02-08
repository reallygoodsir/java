import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileOpenActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JDialog openDialogue = new JDialog();
        openDialogue.setSize(400, 225);
        openDialogue.setLocation(700, 350);
        openDialogue.setTitle("Open Dialogue");
        openDialogue.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        openDialogue.setVisible(true);
    }
}
