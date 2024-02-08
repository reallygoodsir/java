import javax.swing.*;

public class Notepad {
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

        JMenuItem fileNew = new JMenuItem("New");
        FileNewActionListener fileNewActionListener = new FileNewActionListener();
        fileNew.addActionListener(fileNewActionListener);
        JMenuItem fileOpen = new JMenuItem("Open");
        FileOpenActionListener fileOpenActionListener = new FileOpenActionListener();
        fileOpen.addActionListener(fileOpenActionListener);
        JMenuItem fileSave = new JMenuItem("Save");
        JMenuItem fileSaveAs = new JMenuItem("Save As");
        JMenuItem filePrint = new JMenuItem("Print");
        JMenuItem fileExit = new JMenuItem("Exit");
        file.add(fileNew);
        file.add(fileOpen);
        file.add(fileSave);
        file.add(fileSaveAs);
        file.add(filePrint);
        file.add(fileExit);


        JMenuItem editCut = new JMenuItem("Cut");
        JMenuItem editCopy = new JMenuItem("Copy");
        JMenuItem editPaste = new JMenuItem("Paste");
        JMenuItem editDelete = new JMenuItem("Delete");
        JMenuItem editFind = new JMenuItem("Find");
        JMenuItem editFindNext = new JMenuItem("Find Next");
        JMenuItem editReplace = new JMenuItem("Replace");
        JMenuItem editGoTo = new JMenuItem("Go To");
        JMenuItem editSelectAll = new JMenuItem("Select All");
        JMenuItem editTimeDate = new JMenuItem("Time/Date");
        edit.add(editCut);
        edit.add(editCopy);
        edit.add(editPaste);
        edit.add(editDelete);
        edit.addSeparator();
        edit.add(editFind);
        edit.add(editFindNext);
        edit.add(editReplace);
        edit.add(editGoTo);
        edit.addSeparator();
        edit.add(editSelectAll);
        edit.add(editTimeDate);

        JMenuItem formatWrap = new JMenuItem("Word Wrap");
        JMenuItem formatFont = new JMenuItem("Font");
        JMenuItem formatForeground = new JMenuItem("Foreground");
        JMenuItem formatBackground = new JMenuItem("Background");
        format.add(formatWrap);
        format.add(formatFont);
        format.addSeparator();
        format.add(formatForeground);
        format.add(formatBackground);

        JMenuItem viewStatusBar = new JMenuItem("Status Bar");
        view.add(viewStatusBar);

        JMenuItem helpAbout = new JMenuItem("About Notepad");
        help.add(helpAbout);

        frame.setSize(800, 500);
        frame.setLocation(550, 250);
        frame.setVisible(true);
    }
}
