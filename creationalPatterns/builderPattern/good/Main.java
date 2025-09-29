import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Smoothie smoothie = new Smoothie.SmoothieBuilder("Milk","Medium")
        .build();
        Smoothie smoothieWithFruits = new Smoothie.SmoothieBuilder("Milk","Medium")
        .withFruits(Arrays.asList("Banana"))
        .build();
        Smoothie smoothieWithAlmondMilkFruitsAndToppings = new Smoothie.SmoothieBuilder("Almond Milk","Medium")
        .withFruits(Arrays.asList("Banana"))
        .withToppings(Arrays.asList("Elaichi","chocochips"))
        .build();
        Smoothie proteinShake = new Smoothie.SmoothieBuilder("Milk","Medium")
        .withFruits(Arrays.asList("Banana"))
        .withProteinPowder(true)
        .withToppings(Arrays.asList("Elaichi","chocochips"))
        .withSeeds(Arrays.asList("Chia","Flax","Sesame"))
        .build();
    }
}
