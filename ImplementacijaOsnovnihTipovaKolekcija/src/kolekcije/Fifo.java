package kolekcije;

import cvor.Cvor;

public class Fifo extends Kolekcija {

    
   

    // Metoda za dodavanje elementa na pocetak
    @Override
    public void dodaj(int podatak) {
		Cvor novi = new Cvor(podatak,null);
		if(glava == null) {
			glava = novi;
		}else {
			novi.setSledeci(glava);
			glava = novi; 
		}
	}

    // Metoda za uklanjanje i vraćanje prvog elementa iz reda (FIFO princip)
    public int izbaciIzReda() {
        if (glava == null) {
            throw new IllegalStateException("Red je prazan.");
        }
        int element = glava.getPodatak();
        glava = glava.getSledeci(); // glava se pomera na sl cvor
        return element;
    }
}