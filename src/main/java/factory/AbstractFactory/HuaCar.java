package factory.AbstractFactory;

/**
 * @author rongxiaoya
 */
public class HuaCar implements  ICar {


     public void powerOn() {
          System.out.println(" HuaCar  powerOn");
     }

     public void powerDown() {
          System.out.println(" HuaCar  powerDown");
     }

     public void adjustSeat() {
          System.out.println(" HuaCar  adjustSeat");
     }

     public void adjustTemperature() {
          System.out.println(" HuaCar  adjustTemperature");
     }
}
