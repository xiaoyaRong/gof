package factory.AbstractFactory;

public class HuaProductFactory implements IProductFactory {


    public IPhone buildPhone() {
        return new HuaPhone();
    }

    public ICar buildCar() {
        return new HuaCar();
    }
}
