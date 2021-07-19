package factory.AbstractFactory;

/**
 * @author rongxiaoya
 */
public class MiCar implements  ICar {


     public void powerOn() {
          System.out.println(" MiCar  powerOn");

     }

     public void powerDown() {
          System.out.println(" MiCar  powerDown");
     }

     public void adjustSeat() {
          System.out.println(" MiCar  adjustSeat");
     }

     public void adjustTemperature() {
          System.out.println(" MiCar  adjustTemperature");
     }
}
