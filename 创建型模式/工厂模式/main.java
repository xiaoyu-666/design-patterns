package 创建型模式.工厂模式;

import 创建型模式.工厂模式.dialog.Dialog;
import 创建型模式.工厂模式.dialog.HtmlDialog;
import 创建型模式.工厂模式.dialog.WindowsDialog;

public class main {
    private static Dialog dialog;
    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }


    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure() {
        String property = System.getProperty("os.name");
        System.out.println(property);
        if (property.equals("Windows 11")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
