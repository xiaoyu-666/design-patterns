package 行为模式.访问者模式.visitor;

import 行为模式.访问者模式.shapes.Circle;
import 行为模式.访问者模式.shapes.CompoundShape;
import 行为模式.访问者模式.shapes.Dot;
import 行为模式.访问者模式.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}