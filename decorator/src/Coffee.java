import java.util.ArrayList;

/**
 * Created by milabobo on 8:42 PM.
 */
public class Coffee implements CoffeePayable {
    BlackCoffee coffee;
    ArrayList<CoffeePayable> payAbles;

    public Coffee(BlackCoffee coffee) {
        this.coffee = coffee;
        payAbles = new ArrayList<>();
    }

    void addCoffeePayable(CoffeePayable coffeePayable) {
        payAbles.add(coffeePayable);
    }

    @Override
    public int getPrice() {
        int sum = coffee.getPrice();
        for (int i = 0; i < payAbles.size(); i++) {
            sum += payAbles.get(i).getPrice();
        }
        return sum;
    }
}
