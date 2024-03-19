package kolekcije;

import cvor.Cvor;

public class Skup extends Kolekcija {
	
	public void dodajNaPocetak(int podatak) {
		if(daLiPostoji(podatak)) {
			System.out.println("Podatak vec postoji u skupu.");
			return;
		}else {
			Cvor novi = new Cvor(podatak,null);
			novi.setSledeci(glava);
			glava = novi;
		}
	}
	
	public void dodajNaKraj(int podatak) {
		if(daLiPostoji(podatak)) {
			System.out.println("Podatak vec postoji u skupu.");
			return;
		}else {
		    Cvor novi = new Cvor(podatak,null);
		    if (glava == null) {
		        glava = novi;
		    } else {
		        Cvor tekuci = glava;
		        while (tekuci.getSledeci() != null) {
		            tekuci = tekuci.getSledeci();
		        }
		        tekuci.setSledeci(novi); // Set the next node of the last node to the new node
		    }
		}
	}
	
}
