package 创建型模式.抽象工厂模式.factories;

import 创建型模式.抽象工厂模式.buttons.Button;
import 创建型模式.抽象工厂模式.buttons.WindowsButton;
import 创建型模式.抽象工厂模式.checkboxes.Checkbox;
import 创建型模式.抽象工厂模式.checkboxes.WindowsCheckbox;
import 创建型模式.抽象工厂模式.radioboxes.RadioBox;
import 创建型模式.抽象工厂模式.radioboxes.WindowsRadioBox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }

    @Override
    public RadioBox createRadioBox() {
        return new WindowsRadioBox();
    }
}
