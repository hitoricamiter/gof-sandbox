package ru.zaikin.GoF.command;

public class AddTextCommand implements Command {

    private TextEditor editor;
    private String textToAdd;

    public AddTextCommand(TextEditor editor, String textToAdd) {
        this.editor = editor;
        this.textToAdd = textToAdd;
    }

    @Override
    public void execute() {
        editor.addText(textToAdd);
    }

    @Override
    public void undo() {
        editor.deleteLast(textToAdd.length());
    }
}
