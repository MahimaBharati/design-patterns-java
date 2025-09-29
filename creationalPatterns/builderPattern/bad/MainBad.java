import java.util.Arrays;
public class MainBad {
    public static void main(String[] args) {
        Smoothie bananaSmoothie = new Smoothie("Milk","Medium" , Arrays.asList("Banana"),  null, null, null, null);
        //We are having to explicitly specify null in the optional parameters that we don't need which is bad.
        //Readability suffers
        //Looking at the constructor call, you can’t tell what each null means. 
        //Is the 4th argument protein powder? Seeds? Toppings? You need to look back at the constructor definition every time.
    }
}
