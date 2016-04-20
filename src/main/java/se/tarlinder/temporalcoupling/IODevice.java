package se.tarlinder.temporalcoupling;

// Demonstrates temporal coupling
public class IODevice {

    private int port;

    public void initialize() {
        port = DeviceConfig.getPort();
    }

    public void writeData(byte[] data) {
        for (byte b : data) {
            writeByte(port, b);
        }
    }

    private void writeByte(int port, byte data) {
        // Hardware writing logic here
    }

    public static void main(String[] args) {
        IODevice ioDevice = new IODevice();
        byte[] data = new byte[]{(byte) 0xf0, (byte) 0xab, (byte) 0x10};

        ioDevice.initialize();
        ioDevice.writeData(data);
    }
}