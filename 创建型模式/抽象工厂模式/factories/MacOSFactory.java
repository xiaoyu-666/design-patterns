package 创建型模式.抽象工厂模式.factories;

import 创建型模式.抽象工厂模式.buttons.Button;
import 创建型模式.抽象工厂模式.buttons.MacOSButton;
import 创建型模式.抽象工厂模式.checkboxes.Checkbox;
import 创建型模式.抽象工厂模式.checkboxes.MacOSCheckbox;
import 创建型模式.抽象工厂模式.radioboxes.MacOSRadioBox;
import 创建型模式.抽象工厂模式.radioboxes.RadioBox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }

    @Override
    public RadioBox createRadioBox() {
        return new MacOSRadioBox();
    }
}
