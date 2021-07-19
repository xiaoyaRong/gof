package builder;

public class Lunch {

    private String mainFood =  "馒头";
    private String drink =  "豆浆";
    private String smallFood  = "茶鸡蛋";
    private String sweetFood = "糖糕";


    public String getMainFood() {
        return mainFood;
    }

    public void setMainFood(String mainFood) {
        this.mainFood = mainFood;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getSmallFood() {
        return smallFood;
    }

    public void setSmallFood(String smallFood) {
        this.smallFood = smallFood;
    }

    public String getSweetFood() {
        return sweetFood;
    }

    public void setSweetFood(String sweetFood) {
        this.sweetFood = sweetFood;
    }

    @Override
    public String toString() {
        return "Lunch{" +
                "mainFood='" + mainFood + '\'' +
                ", drink='" + drink + '\'' +
                ", smallFood='" + smallFood + '\'' +
                ", sweetFood='" + sweetFood + '\'' +
                '}';
    }
}
