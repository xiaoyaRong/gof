package builder;

public class KFC implements Builder {

    private Lunch lunch;

    public KFC() {
        lunch = new Lunch();
    }

    @Override
    public Builder buildMainFood(String mainFood) {
        lunch.setMainFood(mainFood);
        return this;
    }

    @Override
    public Builder buildDrink(String drinkName) {
        lunch.setDrink(drinkName);
        return this;
    }

    @Override
    public Builder buildSmallFood(String smallFood) {
        lunch.setSmallFood(smallFood);
        return this;
    }

    @Override
    public Builder buildSweetFood(String sweetFood) {
        lunch.setSweetFood(sweetFood);
        return this;
    }

    @Override
    public Lunch genLunch() {
        return lunch;
    }


}
