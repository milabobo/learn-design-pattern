/**
 * Created by milabobo on 8:42 PM.
 */
public class Main {
    public static void main(String[] args) {
        HouseSeller son = new HouseOwnerSon();
        HouseSeller father = new HouseOwnerFather();
        HouseSeller manager = new HouseManager();

        HouseOwner owner = new HouseOwner(son);
        HouseOwner owner1 = new HouseOwner(father);
        HouseOwner owner2 = new HouseOwner(manager);

        owner.sellHouse();
        owner1.sellHouse();
        owner2.sellHouse();
    }
}
