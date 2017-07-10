/**
 * Created by tianu on 7/10/17.
 */
public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee(new BlackCoffee());
        coffee.addCoffeePayable(new Suger());
        coffee.addCoffeePayable(new Milk());
        System.out.println(coffee.getPrice());
    }
}
