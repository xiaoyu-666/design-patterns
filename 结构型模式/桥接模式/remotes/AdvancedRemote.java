package 结构型模式.桥接模式.remotes;

import 结构型模式.桥接模式.devices.Device;

public class AdvancedRemote extends BasicRemote{
    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
