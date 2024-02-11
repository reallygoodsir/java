import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileOpenActionListener implements ActionListener {
    private final JTextArea textArea;

    public FileOpenActionListener(JTextArea ta) {
        this.textArea = ta;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JFileChooser fileChooser = new JFileChooser();
        int userPressedButton = fileChooser.showOpenDialog(null);

        if (userPressedButton == 0) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                char[] fileData = new char[1000];
                FileReader fileReader = new FileReader(selectedFile);
                fileReader.read(fileData);
                fileReader.close();

                StringBuilder txt = new StringBuilder();
                for (char letter : fileData) {
                    txt.append(letter);
                }

                textArea.setText(txt.toString());
                textArea.setVisible(true);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}