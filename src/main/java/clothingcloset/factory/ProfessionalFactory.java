package clothingcloset.factory;

import clothingcloset.products.Pants;
import clothingcloset.products.Shoes;
import clothingcloset.products.Top;
import clothingcloset.products.impl.ProfessionalPants;
import clothingcloset.products.impl.ProfessionalShoes;
import clothingcloset.products.impl.ProfessionalTop;

public class ProfessionalFactory implements GarmentFactory {
    public Top createTop() { return new ProfessionalTop(); }
    public Pants createPants() { return new ProfessionalPants(); }
    public Shoes createShoes() { return new ProfessionalShoes(); }
}
