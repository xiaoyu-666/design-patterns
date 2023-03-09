package 行为模式.备忘录模式.commands;

import 行为模式.备忘录模式.editor.Editor;
import 行为模式.备忘录模式.shapes.Shape;
import java.awt.*;


public class ColorCommand implements Command {
    private Editor editor;
    private Color color;

    public ColorCommand(Editor editor, Color color) {
        this.editor = editor;
        this.color = color;
    }

    @Override
    public String getName() {
        return "Colorize: " + color.toString();
    }

    @Override
    public void execute() {
        for (Shape child : editor.getShapes().getSelected()) {
            child.setColor(color);
        }
    }
}