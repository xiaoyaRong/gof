package factory.AbstractFactory;

public class main {

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
