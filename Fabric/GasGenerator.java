package Fabric;

import Interface.iGameItem;
import Product.GasReward;

public class GasGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new GasReward();
    }
}
