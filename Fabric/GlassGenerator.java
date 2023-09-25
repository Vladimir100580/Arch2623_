package Fabric;

import Interface.iGameItem;
import Product.GlassReward;

public class GlassGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new GlassReward();
    }
}
