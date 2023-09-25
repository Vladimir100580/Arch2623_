package Fabric;

import Interface.iGameItem;
import Product.OilReward;

public class OilGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new OilReward();
    }
}