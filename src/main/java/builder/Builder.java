package builder;

public interface Builder {

    Builder buildMainFood(String mainFood);
    Builder buildDrink(String drink);
    Builder buildSmallFood(String smallFood);
    Builder buildSweetFood(String sweetFood);

    Lunch genLunch();




}
