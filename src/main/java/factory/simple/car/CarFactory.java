package factory.simple.car;

public class CarFactory {

    public  static ICar getCar(String product){

        if("audi".equals(product)){
            return new AudiCar();
        }else if("mi".equals(product)){
            return new MiCar();
        }else{
            return null;
        }
    }

    public static  void main(String[] arg){
        ICar mi = CarFactory.getCar("mi");
        mi.show();
    }

}
