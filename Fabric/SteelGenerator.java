package Fabric;

import Interface.iGameItem;
import Product.SteelReward;

public class SteelGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new SteelReward();
    }
}
