package exemplul04;

public class Autoturism extends Vehicul{
    int volum,cantar;

    public Autoturism() {
    }

    public Autoturism(String marca, int pret, int volum, int cantar) {
        super(marca, pret);
        this.volum = volum;
        this.cantar = cantar;
    }

    public int getVolum() {
        return volum;
    }

    public void setVolum(int volum) {
        this.volum = volum;
    }

    public int getCantar() {
        return cantar;
    }

    public void setCantar(int cantar) {
        this.cantar = cantar;
    }

    @Override
    public String toString() {
        return "Autoturism{" +
                super.toString() +
                "volum=" + volum +
                ", cantar=" + cantar +
                "} " ;
    }
}
