package 创建型模式.抽象工厂模式;

import 创建型模式.抽象工厂模式.app.Application;
import 创建型模式.抽象工厂模式.factories.GUIFactory;
import 创建型模式.抽象工厂模式.factories.MacOSFactory;
import 创建型模式.抽象工厂模式.factories.WindowsFactory;

public class main {
    public static void main(String[] args) {
        Application app = configureApplication("");
        app.paint();
    }

    private static Application configureApplication(String name){
        Application app;
        GUIFactory factory;
        String osName = name.isBlank()? System.getProperty("os.name").toLowerCase():name;
        if (osName.contains("mac")){
            factory=new MacOSFactory();
        }else {
            factory=new WindowsFactory();
        }
        app=new Application(factory);
        return app;
    }
}
