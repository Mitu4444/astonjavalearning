package module.three.adaptor;

public class UsbPort {

    public void pluging(UsbFlash flash){
        flash.setPlug(true);
    }

    public void unpluging(UsbFlash flash){
        flash.setPlug(false);
    }
}
