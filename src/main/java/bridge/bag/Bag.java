package bridge.bag;

public abstract class Bag {

    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

   protected abstract String bagInfo();

}
