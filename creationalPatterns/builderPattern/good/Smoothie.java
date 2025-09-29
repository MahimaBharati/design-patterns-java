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

    private Smoothie(SmoothieBuilder builder) {
        this.base=builder.base;
        this.size=builder.size;
        this.fruits=builder.fruits;
        this.proteinPowder=builder.proteinPowder;
        this.seeds=builder.seeds;
        this.sweetener=builder.sweetener;
        this.toppings=builder.toppings;
    }

    public static class SmoothieBuilder{
        String base;
        String size;//could be small medium or large
        //Optional params
        List<String> fruits;
        Boolean proteinPowder;
        List<String> seeds;
        String sweetener;
        List<String> toppings;

        //Initialise mandatory params
        public SmoothieBuilder(String base, String size) {
        this.base=base;
        this.size=size;
        }

        public SmoothieBuilder withFruits(List<String> fruits) {
            this.fruits=fruits;
            return this;
        }
        public SmoothieBuilder withProteinPowder(Boolean proteinPowder) {
            this.proteinPowder=proteinPowder;
            return this;
        }
        public SmoothieBuilder withSeeds(List<String> seeds) {
            this.seeds=seeds;
            return this;
        }

        public SmoothieBuilder withSweetener(String sweetener) {
            this.sweetener=sweetener;
            return this;
        }
        public SmoothieBuilder withToppings(List<String> toppings) {
            this.toppings=toppings;
            return this;
        }
        public Smoothie build() {
            return new Smoothie(this);
        }
    }
}