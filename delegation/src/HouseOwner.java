/**
 * Created by tianu on 7/10/17.
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
