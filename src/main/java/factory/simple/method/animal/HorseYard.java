package factory.simple.method.animal;

/**
 * @author rongxiaoya
 */
public class HorseYard implements Yard {


    public Animal buyAnimal() {
        return new Horse();
    }
}
