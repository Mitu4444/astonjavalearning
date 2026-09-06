package module.three.adaptor;

public class EhernetCabelAdaptor extends UsbFlash{

    private EthernetCabel ethernet;

    public EhernetCabelAdaptor(EthernetCabel ethernet){
        this.ethernet = ethernet;
    }

    @Override
    public void setPlug(boolean plug) {
        ethernet.setPlug(plug);
    }
}
