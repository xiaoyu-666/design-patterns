package 结构型模式.桥接模式;

import 结构型模式.桥接模式.devices.Device;
import 结构型模式.桥接模式.devices.Radio;
import 结构型模式.桥接模式.devices.Tv;
import 结构型模式.桥接模式.remotes.AdvancedRemote;
import 结构型模式.桥接模式.remotes.BasicRemote;

public class main {
    public static void main(String[] args) {

        testDevice(new Tv());
        testDevice(new Radio());
    }
    public static void testDevice(Device device){
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
