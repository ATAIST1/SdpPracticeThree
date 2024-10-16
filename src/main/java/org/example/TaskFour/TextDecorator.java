package org.example.TaskFour;
public abstract class TextDecorator implements TextEditor {
    protected TextEditor editor;
    public TextDecorator(TextEditor editor) {
        this.editor = editor;
    }
    public String write() {
        return editor.write();
    }
}

