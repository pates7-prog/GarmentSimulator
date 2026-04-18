package clothingcloset.factory;

import clothingcloset.products.Pants;
import clothingcloset.products.Shoes;
import clothingcloset.products.Top;
import clothingcloset.products.impl.CasualPants;
import clothingcloset.products.impl.CasualShoes;
import clothingcloset.products.impl.CasualTop;

public class CasualFactory implements GarmentFactory {
    public Top createTop() { return new CasualTop(); }
    public Pants createPants() { return new CasualPants(); }
    public Shoes createShoes() { return new CasualShoes(); }
}
