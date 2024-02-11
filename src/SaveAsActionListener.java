import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

public class SaveAsActionListener implements ActionListener {
    private final JTextArea textArea;

    public SaveAsActionListener(JTextArea ta) {
        this.textArea = ta;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JFileChooser fileChooser = new JFileChooser();
        int retrieve = fileChooser.showSaveDialog(null);

        if (retrieve == 0) {
            try {
                String fileName = fileChooser.getSelectedFile() + ".txt";
                FileWriter fileWriter = new FileWriter(fileName);
                fileWriter.write(textArea.getText());
                fileWriter.close();
            } catch (Exception exception) {
                JDialog errorDialogue = new JDialog();
                errorDialogue.setTitle("ERROR" + exception.getMessage());
                errorDialogue.setSize(50, 20);
                errorDialogue.setLocation(800, 400);
                errorDialogue.setVisible(true);
            }
        } else if (retrieve == 1) {
            JDialog errorDialogue = new JDialog();
            errorDialogue.setTitle("You selected cancel");
            errorDialogue.setSize(220, 40);
            errorDialogue.setLocation(800, 400);
            errorDialogue.setVisible(true);
        }
    }
}