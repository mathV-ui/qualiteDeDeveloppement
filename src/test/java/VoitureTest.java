import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VoitureTest {

    @Test
    public void testGetMarque() {
        Voiture voiture = new Voiture("Toyota", 20000);
        assertEquals("Toyota", voiture.getMarque());
    }

    @Test
    public void testSetMarque() {
        Voiture voiture = new Voiture("Toyota", 20000);
        voiture.setMarque("Honda");
        assertEquals("Honda", voiture.getMarque());
    }

    @Test
    public void testGetPrix() {
        Voiture voiture = new Voiture("Toyota", 20000);
        assertEquals(20000, voiture.getPrix());
    }

    @Test
    public void testSetPrix() {
        Voiture voiture = new Voiture("Toyota", 20000);
        voiture.setPrix(25000);
        assertEquals(25000, voiture.getPrix());
    }
}