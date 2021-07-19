package factory.simple.method.animal;

public class PigYard implements Yard {


    public Animal buyAnimal() {
        return new Pig();
    }
}
