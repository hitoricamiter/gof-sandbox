package ru.zaikin.GoF.memento;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.write("Привет");
        history.save(editor);

        editor.write(", мир!");
        history.save(editor);

        editor.write(" Это лишнее.");

        System.out.println("Текущий текст: " + editor.getText());

        // Откат
        history.undo(editor);
        System.out.println("После отката: " + editor.getText());

        history.undo(editor);
        System.out.println("Ещё откат: " + editor.getText());
    }
}