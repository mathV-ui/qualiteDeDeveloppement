
public class Voiture {


    private String marque;
    private double prix;

    // Constructeur
    public Voiture(String marque, double prix) {
        this.marque = marque;
        this.prix = prix;
    }

    // Getters et Setters
    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String toString() {
        return "Voiture{" +
                "marque='" + marque + '\'' +
                ", prix=" + prix +
                '}';
    }
}