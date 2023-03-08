package 创建型模式.原型模式;

import 创建型模式.原型模式.shapes.Circle;
import 创建型模式.原型模式.shapes.Rectangle;
import 创建型模式.原型模式.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        ArrayList<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x=10;
        circle.y=20;
        circle.radius=15;
        circle.color="red";
        shapes.add(circle);
        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes,shapesCopy);


    }

    private static void cloneAndCompare(List<Shape> shapes,List<Shape> shapesCopy){
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }


}
