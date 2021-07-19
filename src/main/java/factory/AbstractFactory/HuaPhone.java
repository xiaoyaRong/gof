package factory.AbstractFactory;

/**
 * @author rongxiaoya
 */
public class HuaPhone implements IPhone{
     public void powerOn() {
          //开机
          //。。。。一系列方法
          System.out.println("HuaPhone powerOn ");

     }

     public void powerDown() {
          //关机
          System.out.println("HuaPhone powerDown ");
     }

     public void call() {
          //打电话
          System.out.println("HuaPhone call ");
     }

     public void surfingInternet() {
          //上网
          System.out.println("HuaPhone surfingInternet ");
     }
}

