package Fabric;

import Interface.iGameItem;
import Product.TreeReward;

public class TreeGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new TreeReward();
    }
}
