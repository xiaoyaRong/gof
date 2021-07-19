package bridge;

public class Computer {

    private Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    void info(){
        brand.BrandInfo();
    }

    public static void main(String[] args) {
        //Computer computer = new Computer(new Mac());
        //computer.info();
        Computer computer = new Desktop(new Mac());
        computer.info();
    }

}


