package clothingcloset.factory;

import clothingcloset.products.Pants;
import clothingcloset.products.Shoes;
import clothingcloset.products.Top;
import clothingcloset.products.impl.PartyPants;
import clothingcloset.products.impl.PartyShoes;
import clothingcloset.products.impl.PartyTop;

public class PartyFactory implements GarmentFactory {
    public Top createTop() { return new PartyTop(); }
    public Pants createPants() { return new PartyPants(); }
    public Shoes createShoes() { return new PartyShoes(); }
}
