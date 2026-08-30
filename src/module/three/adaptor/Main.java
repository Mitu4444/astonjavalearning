package module.three.adaptor;

public class Main {

    public static void main(String[] args) {

        UsbPort usbPort = new UsbPort();
        UsbFlash usbFlash = new UsbFlash();
        EthernetCabel ethernet = new EthernetCabel();

        usbPort.pluging(usbFlash);
        //usbPort.pluging(ethernet);

        EhernetCabelAdaptor ehernetAdaptor = new EhernetCabelAdaptor(ethernet);

        usbPort.pluging(ehernetAdaptor);

        System.out.println("Flash is plug - " + usbFlash.isPlug());
        System.out.println("Ethernet is plug - " + ethernet.isPlug());
    }
}
