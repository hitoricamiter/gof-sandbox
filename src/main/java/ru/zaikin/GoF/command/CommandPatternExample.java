package ru.zaikin.GoF.command;

// Client
public class CommandPatternExample {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CommandManager manager = new CommandManager();

        manager.executeCommand(new AddTextCommand(editor, "Hello "));
        manager.executeCommand(new AddTextCommand(editor, "World!"));

        System.out.println("Текущий текст: " + editor.getText());

        manager.undoLast(); // отмена
        System.out.println("После undo: " + editor.getText());
    }
}

/*
*
* Command нужен, чтобы отделить «что сделать» от «кто это делает»,
* и при этом иметь гибкость — отмена, история, макросы, лёгкое добавление новых действий.
* */