package bridge.bag;

public class BuyBag {
    public static void main(String[] args) {

        //Use bag = new Wallet(new Red());
        //System.out.println(bag.useInfo());
        // bag = new Wallet(new Yellow());
        //System.out.println(bag.useInfo());
        Bag bag = new HangBag();
        Wallet wallet = new Wallet();
        Yellow yellow = new Yellow();
        bag.setColor(yellow);
        wallet.setColor(yellow);
        System.out.println(bag.bagInfo());
        System.out.println(wallet.bagInfo());

    }
}
