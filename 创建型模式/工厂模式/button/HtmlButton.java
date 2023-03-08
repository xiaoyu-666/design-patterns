package 创建型模式.工厂模式.button;

public class HtmlButton implements Button{
    @Override
    public void render() {
        System.out.println("<创建型模式.工厂模式.button>Test Button</创建型模式.工厂模式.button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
