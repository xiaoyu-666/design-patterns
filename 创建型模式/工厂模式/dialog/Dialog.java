package 创建型模式.工厂模式.dialog;

import 创建型模式.工厂模式.button.Button;

public abstract class Dialog {
    public void renderWindow(){
        Button okButton=createButton();
        okButton.render();
    }
    public abstract Button createButton();
}
