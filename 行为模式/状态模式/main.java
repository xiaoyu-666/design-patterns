package 行为模式.状态模式;

import 行为模式.状态模式.ui.Player;
import 行为模式.状态模式.ui.UI;

public class main {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
