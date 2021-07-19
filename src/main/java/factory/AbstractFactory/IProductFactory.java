package factory.AbstractFactory;

public interface IProductFactory {

    /**
     * @return
     */
    IPhone buildPhone();
    /**
     * @return
     */
    ICar buildCar();
}
