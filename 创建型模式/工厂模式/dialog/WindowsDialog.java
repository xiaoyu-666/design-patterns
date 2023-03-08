package 创建型模式.工厂模式.dialog;

import 创建型模式.工厂模式.button.Button;
import 创建型模式.工厂模式.button.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
