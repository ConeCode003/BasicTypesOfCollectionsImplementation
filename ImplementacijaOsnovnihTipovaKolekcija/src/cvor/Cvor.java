package cvor;

public class Cvor {
    private int podatak;
    private Cvor sledeci;

    public Cvor(int podatak, Cvor sledeci) {
        this.podatak = podatak;
        this.sledeci = sledeci;
    }

    public int getPodatak() {
        return podatak;
    }

    public void setPodatak(int podatak) {
        this.podatak = podatak;
    }

    public Cvor getSledeci() {
        return sledeci;
    }

    public void setSledeci(Cvor sledeci) {
        this.sledeci = sledeci;
    }
}

