/**
 * Created by milabobo on 8:42 PM.
 */
public class HouseOwner implements HouseSeller {

    HouseSeller seller;

    public HouseOwner(HouseSeller seller) {
        this.seller = seller;
    }

    @Override
    public void sellHouse() {
        seller.sellHouse();
    }
}
