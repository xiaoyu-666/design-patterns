package 创建型模式.抽象工厂模式.radioboxes;

public class WindowsRadioBox implements RadioBox{
    @Override
    public void paint() {
        System.out.println("You have created WindowsRadioBox.");
    }
}
