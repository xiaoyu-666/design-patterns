package 创建型模式.抽象工厂模式.app;

import 创建型模式.抽象工厂模式.buttons.Button;
import 创建型模式.抽象工厂模式.checkboxes.Checkbox;
import 创建型模式.抽象工厂模式.factories.GUIFactory;
import 创建型模式.抽象工厂模式.radioboxes.RadioBox;

public class Application {
    private Button button;
    private Checkbox checkbox;
    private RadioBox radioBox;

    public Application(GUIFactory factory){
        button=factory.createButton();
        checkbox=factory.createCheckbox();
        radioBox=factory.createRadioBox();

    }

    public void paint(){
        button.paint();
        checkbox.paint();
        radioBox.paint();
    }

}
