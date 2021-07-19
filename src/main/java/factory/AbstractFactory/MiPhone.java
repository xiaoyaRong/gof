package factory.AbstractFactory;

/**
 * @author rongxiaoya
 */
public class MiPhone implements IPhone {


     public void powerOn() {
          //开机
          //。。。。一系列方法
          System.out.println("MiPhone powerOn ");

     }

     public void powerDown() {
          //关机
          System.out.println("MiPhone powerDown ");
     }

     public void call() {
          //打电话
          System.out.println("MiPhone call ");
     }

     public void surfingInternet() {
          //上网
          System.out.println("MiPhone surfingInternet ");
     }
}
