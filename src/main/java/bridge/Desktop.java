package bridge;

public class Desktop extends Computer {


    public Desktop(Brand brand) {
        super(brand);
    }


    @Override
    void info() {
        super.info();
        System.out.print("台式机");
    }
}
