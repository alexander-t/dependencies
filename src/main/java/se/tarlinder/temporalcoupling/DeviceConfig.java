package se.tarlinder.temporalcoupling;

public class DeviceConfig {

    public static final int PORT_RANGE_1 = 0x200;
    public static final int PORT_RANGE_2 = 0x210;
    public static final int PORT_RANGE_3 = 0x220;

    public static int getPort() {
        return PORT_RANGE_3;
    }
}
