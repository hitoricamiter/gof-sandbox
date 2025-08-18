package ru.zaikin.GoF.command;

public class TextEditor {
    private StringBuilder text = new StringBuilder();

    public void addText(String newText) {
        text.append(newText);
    }

    public void deleteLast(int length) {
        if (text.length() >= length) {
            text.delete(text.length() - length, text.length());
        }
    }

    public String getText() {
        return text.toString();
    }
}
