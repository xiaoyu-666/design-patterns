package 行为模式.中介者模式;

import 行为模式.中介者模式.components.*;
import 行为模式.中介者模式.mediator.Editor;
import 行为模式.中介者模式.mediator.Mediator;


import javax.swing.*;

public class main {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
