package clothingcloset;

import clothingcloset.factory.CasualFactory;
import clothingcloset.factory.GarmentFactory;
import clothingcloset.factory.PartyFactory;
import clothingcloset.factory.ProfessionalFactory;
import clothingcloset.products.Pants;
import clothingcloset.products.Shoes;
import clothingcloset.products.Top;

import java.util.Scanner;

//The client selects a factory (e.g., CasualFactory).
// * 2. The factory creates a full set of matching garments.
// * 3. Each product implements a common interface and defines its behavior.
// * 4. The driver class demonstrates usage by creating and "wearing" the outfit.

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter style (casual, professional, party): ");
        String choice = scanner.nextLine();

        GarmentFactory factory;

        switch (choice.toLowerCase()) {
            case "professional":
                factory = new ProfessionalFactory();
                break;
            case "party":
                factory = new PartyFactory();
                break;
            default:
                factory = new CasualFactory();
        }

        Top top = factory.createTop();
        Pants pants = factory.createPants();
        Shoes shoes = factory.createShoes();

        top.wear();
        pants.wear();
        shoes.wear();
    }
}