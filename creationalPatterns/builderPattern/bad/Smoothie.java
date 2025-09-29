import java.util.List;   
import java.util.ArrayList;
class Smoothie{
    //mandatory params
    String base;
    String size;//could be small medium or large
    //Optional params
    List<String> fruits;
    Boolean proteinPowder;
    List<String> seeds;
    String sweetener;
    List<String> toppings;

    Smoothie(String base, String size, List<String> fruits, Boolean proteinPowder, List<String> seeds, String sweetener, List<String> toppings) {
        this.base=base;
        this.size=size;
        this.fruits=fruits;
        this.proteinPowder=proteinPowder;
        this.seeds=seeds;
        this.sweetener=sweetener;
        this.toppings=toppings;
    }
    //We can have more constructors with lesser parameters by overloading the constructor to have lesser params taken- telescoping constructor anti-pattern.
    //But that might end up very complicated and cause mistakes when we have several attributes like this.
}