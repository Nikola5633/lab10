package exemplul04;

public class Motocicleta extends Vehicul {
    private int viteza;

    public Motocicleta() {
    }

    public Motocicleta(String marca, int pret, int viteza) {
        super(marca, pret);
        this.viteza=viteza;
    }

    public int getViteza() {
        return viteza;
    }

    public void setViteza(int viteza) {
        this.viteza = viteza;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "viteza=" + viteza +
                "} " + super.toString();
    }
}
