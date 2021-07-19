package factory.simple.method.animal;

public class Person {

    public static void main(String[] args) {

        Yard yard = new HorseYard();
        Animal animal;
        animal = yard.buyAnimal();
        animal.yell();
    }


}
