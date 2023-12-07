package exemplul04;

public class Tir extends Vehicul{
    int incarcatura;

    public Tir() {
    }

    public Tir(String marca, int pret, int incarcatura) {
        super(marca, pret);
        this.incarcatura = incarcatura;
    }

    public int getIncarcatura() {
        return incarcatura;
    }

    public void setIncarcatura(int incarcatura) {
        this.incarcatura = incarcatura;
    }


    @Override
    public String toString() {
        return "Tir{" +
                "incarcatura=" + incarcatura +
                "} " + super.toString();
    }
}
