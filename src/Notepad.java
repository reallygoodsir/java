import javax.swing.*;
import javax.swing.event.DocumentListener;
import javax.swing.event.MenuListener;
import javax.swing.text.Document;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;


public class Notepad implements MenuConstants {
    final String menuFile = "File";
    final String menuEdit = "Edit";
    final String menuFormat = "Format";
    final String menuView = "View";
    final String menuHelp = "Help";

    public void start() {
        JFrame frame = new JFrame();
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane);
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu(menuFile);
        menuBar.add(file);
        JMenu edit = new JMenu(menuEdit);
        menuBar.add(edit);
        JMenu format = new JMenu(menuFormat);
        menuBar.add(format);
        JMenu view = new JMenu(menuView);
        menuBar.add(view);
        JMenu help = new JMenu(menuHelp);
        menuBar.add(help);
        frame.setJMenuBar(menuBar);

        JMenuItem Fnew = new JMenuItem(fileNew);
        JMenuItem Fopen = new JMenuItem(fileOpen);
        JMenuItem Fsave = new JMenuItem(fileSave);
        JMenuItem FsaveAs = new JMenuItem(fileSaveAs);
        JMenuItem Fprint = new JMenuItem(filePrint);
        JMenuItem Fexit = new JMenuItem(fileExit);
        file.add(Fnew);file.add(Fopen);file.add(Fsave);
        file.add(FsaveAs);file.add(Fprint);file.add(Fexit);

        JMenuItem Ecut = new JMenuItem(editCut);
        JMenuItem Ecopy = new JMenuItem(editCopy);
        JMenuItem Epaste = new JMenuItem(editPaste);
        JMenuItem Edelete = new JMenuItem(editDelete);
        JMenuItem Efind = new JMenuItem(editFind);
        JMenuItem EfindNext = new JMenuItem(editFindNext);
        JMenuItem Ereplace = new JMenuItem(editReplace);
        JMenuItem EgoTo = new JMenuItem(editGoTo);
        JMenuItem EselectAll = new JMenuItem(editSelectAll);
        JMenuItem EtimeDate = new JMenuItem(editTimeDate);
        edit.add(Ecut);edit.add(Ecopy);edit.add(Epaste);edit.add(Edelete);
        edit.addSeparator();
        edit.add(Efind);edit.add(EfindNext);edit.add(Ereplace);edit.add(EgoTo);
        edit.addSeparator();
        edit.add(EselectAll);edit.add(EtimeDate);


        JMenuItem frmWrap = new JMenuItem(formatWordWrap);
        JMenuItem frmFont = new JMenuItem(formatFont);
        JMenuItem frmForeground = new JMenuItem(formatForeground);
        JMenuItem frmBackground = new JMenuItem(formatBackground);
        format.add(frmWrap);format.add(frmFont);
        format.addSeparator();
        format.add(frmForeground);format.add(frmBackground);

        JMenuItem vStatusBar = new JMenuItem(viewStatusBar);
        view.add(vStatusBar);


        JMenuItem hAbt = new JMenuItem(helpAboutNotepad);
        help.add(hAbt);


        frame.add(new JLabel(""), BorderLayout.EAST);
        frame.add(new JLabel(""), BorderLayout.WEST);


        frame.setSize(800, 500);
        frame.setLocation(300, 200);
        frame.setVisible(true);

    }

}
