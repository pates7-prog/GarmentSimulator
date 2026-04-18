package clothingcloset.factory;

import clothingcloset.products.Pants;
import clothingcloset.products.Shoes;
import clothingcloset.products.Top;

public interface GarmentFactory {
    Top createTop();
    Pants createPants();
    Shoes createShoes();
}
