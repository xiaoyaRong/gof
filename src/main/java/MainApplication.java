import factory.AbstractFactory.ICar;
import factory.AbstractFactory.IPhone;
import factory.AbstractFactory.IProductFactory;
import factory.AbstractFactory.MiProductFactory;

/**
 * @author rongxiaoya
 */
public class MainApplication {
    //public static void main (String[]  args){
    //
    //    //test abstract factory
    //    IProductFactory productFactory = new HuaProductFactory();
    //
    //    ICar iCar = productFactory.buildCar();
    //    iCar.powerOn();
    //    iCar.adjustSeat();
    //    iCar.adjustTemperature();
    //    iCar.powerDown();
    //
    //    IPhone iPhone = productFactory.buildPhone();
    //    iPhone.powerOn();
    //    iPhone.call();
    //    iPhone.surfingInternet();
    //    iPhone.powerDown();
    //
    //}
    public static void main (String[]  args){

        //test abstract factory
        IProductFactory productFactory = new MiProductFactory();

        ICar iCar = productFactory.buildCar();
        iCar.powerOn();
        iCar.adjustSeat();
        iCar.adjustTemperature();
        iCar.powerDown();

        IPhone iPhone = productFactory.buildPhone();
        iPhone.powerOn();
        iPhone.call();
        iPhone.surfingInternet();
        iPhone.powerDown();

    }
}
