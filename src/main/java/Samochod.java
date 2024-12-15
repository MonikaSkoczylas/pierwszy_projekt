public class Samochod {

    private String model;
    private int rok_produkcji;
    private int ilosc_drzwi;
    private int v_max;
    private boolean czy_jedziemy = false;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRok_produkcji() {
        return rok_produkcji;
    }

    public void setRok_produkcji(int rok_produkcji) {
        this.rok_produkcji = rok_produkcji;
    }

    public int getIlosc_drzwi() {
        return ilosc_drzwi;
    }

    public void setIlosc_drzwi(int ilosc_drzwi) {
        this.ilosc_drzwi = ilosc_drzwi;
    }

    public int getV_max() {
        return v_max;
    }

    public void setV_max(int v_max) {
        this.v_max = v_max;
    }

    boolean rusz() {
        System.out.println("Jedziemy");
        czy_jedziemy = true;
        return czy_jedziemy;
    }

    boolean zatrzymajSie() {
        System.out.println("Zatrzymujemy się");
        czy_jedziemy = false;
        return czy_jedziemy;
    }
}
