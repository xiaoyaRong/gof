package bridge;

public class Laptop extends Computer {


    public Laptop(Brand brand) {
        super(brand);
    }


    @Override
    void info() {
        super.info();
        System.out.print("笔记本");
    }
}
