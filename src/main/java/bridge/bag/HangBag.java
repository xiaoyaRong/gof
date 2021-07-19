package bridge.bag;

public class HangBag extends Bag {


    @Override
    protected String bagInfo() {

        String colorInfo = color.colorInfo();
        return colorInfo + "  "  + "hangbag";
    }
}
