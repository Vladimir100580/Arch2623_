package Fabric;

import Interface.iGameItem;
import Product.SilverReward;

public class SilverGenerator extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new SilverReward();
    }

}
