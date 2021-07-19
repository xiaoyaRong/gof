package builder;

public class KfcRestrant {
    public static void main(String[] args) {
        KFC kfc = new KFC();
        Lunch lunch = kfc.buildMainFood("嫩牛五方").buildDrink("可乐").buildSmallFood("全家桶").buildSweetFood("豌豆派").
                genLunch();
        System.out.println(lunch.toString());

    }
}
