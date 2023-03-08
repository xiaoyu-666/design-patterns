package 创建型模式.工厂模式.dialog;

import 创建型模式.工厂模式.button.Button;
import 创建型模式.工厂模式.button.HtmlButton;

public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
