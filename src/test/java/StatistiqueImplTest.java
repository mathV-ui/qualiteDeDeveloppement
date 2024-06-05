
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class StatistiqueImplTest {

    @Test
    void testAjouterEtPrix() {
        Statistique statistique = new StatistiqueImpl();
        Voiture voiture1 = new Voiture("Toyota", 15000);
        Voiture voiture2 = new Voiture("Honda", 20000);
        Voiture voiture3 = new Voiture("Ford", 18000);
        Voiture voiture4 = new Voiture("BMW", 25000);
        Voiture voiture5 = new Voiture("Audi", 30000);

        statistique.ajouter(voiture1);
        statistique.ajouter(voiture2);
        statistique.ajouter(voiture3);
        statistique.ajouter(voiture4);
        statistique.ajouter(voiture5);

        System.out.println("Voitures ajoutées :");
        System.out.println("Toyota - 15000");
        System.out.println("Honda - 20000");
        System.out.println("Ford - 18000");
        System.out.println("BMW - 25000");
        System.out.println("Audi - 30000");

        int prixTotal = statistique.prix();
        int expectedPrixTotal = (15000 + 20000 + 18000 + 25000 + 30000) - ((15000 + 20000 + 18000 + 25000 + 30000) * 5 / 100);

        System.out.println("Prix total attendu : " + expectedPrixTotal);
        System.out.println("Prix total calculé : " + prixTotal);

        assertEquals(expectedPrixTotal, prixTotal);
    }

    @Test
    void testPrixSansVoiture() {
        Statistique statistique = new StatistiqueImpl();
        System.out.println("Tester le calcul du prix sans aucune voiture ajoutée...");
        assertThrows(ArithmeticException.class, statistique::prix);
        System.out.println("Exception ArithmeticException attendue et capturée.");
    }

    @Test
    void testPrixAvecRemiseMaximale() {
        Statistique statistique = new StatistiqueImpl();

        System.out.println("Ajout de 25 voitures avec un prix de 10000 chacune...");
        for (int i = 0; i < 25; i++) {
            statistique.ajouter(new Voiture("Car" + i, 10000));
        }

        int prixTotal = statistique.prix();
        int expectedPrixTotal = (25 * 10000) - 20000; // 20 000 euros de remise maximale

        System.out.println("Prix total attendu (avec remise maximale) : " + expectedPrixTotal);
        System.out.println("Prix total calculé : " + prixTotal);

        assertEquals(expectedPrixTotal, prixTotal);
    }
}