/**
 * Created by milabobo on 8:42 PM.
 */
public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee(new BlackCoffee());
        coffee.addCoffeePayable(new Suger());
        coffee.addCoffeePayable(new Milk());
        System.out.println(coffee.getPrice());
    }
}
