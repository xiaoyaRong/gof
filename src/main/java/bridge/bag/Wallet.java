package bridge.bag;

public class Wallet extends Bag {


    @Override
    protected String bagInfo() {

        return color.colorInfo() + " "  + "wallet";
    }
}
