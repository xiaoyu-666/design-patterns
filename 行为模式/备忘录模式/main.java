package 行为模式.备忘录模式;

import 行为模式.备忘录模式.editor.Editor;
import 行为模式.备忘录模式.shapes.Circle;
import 行为模式.备忘录模式.shapes.CompoundShape;
import 行为模式.备忘录模式.shapes.Dot;
import 行为模式.备忘录模式.shapes.Rectangle;

import java.awt.*;

public class main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
