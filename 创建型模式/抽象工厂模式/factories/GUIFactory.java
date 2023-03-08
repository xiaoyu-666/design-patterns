package 创建型模式.抽象工厂模式.factories;

import 创建型模式.抽象工厂模式.buttons.Button;
import 创建型模式.抽象工厂模式.checkboxes.Checkbox;
import 创建型模式.抽象工厂模式.radioboxes.RadioBox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
    RadioBox createRadioBox();
}
