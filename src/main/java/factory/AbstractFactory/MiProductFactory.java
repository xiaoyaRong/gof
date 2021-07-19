package factory.AbstractFactory;

public class MiProductFactory implements IProductFactory {


    public IPhone buildPhone() {
        return new MiPhone();
    }

    public ICar buildCar() {
        return new MiCar();
    }
}
