package kolekcije;

import interfejsKolekcije.InterfejsKolekcije;
import cvor.Cvor;

public abstract class Kolekcija implements InterfejsKolekcije {
	
	protected Cvor glava = null;
	
	@Override	
	public void dodaj(int podatak) {
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


	@Override
	public void izbaci(int podatak) {
		Cvor prethodni = null;
		Cvor tekuci = glava;
		
		if(glava == null) {
			System.out.println("Kolekcija je prazna.");
			return;
		}

		while(tekuci != null && tekuci.getPodatak() != podatak) {
			prethodni = tekuci;
			tekuci = tekuci.getSledeci();
		}
		
		if(tekuci == null) {
			System.out.println("Ne mozes da izbacis:"+podatak+",ne postoji u listi!");
			return;
		}
		
		if(prethodni == null) {
			glava = tekuci.getSledeci(); 
		}else {
			prethodni.setSledeci(tekuci.getSledeci());
		}
	}

	@Override
	public void prikazi() {
		Cvor tekuci = glava;
		while(tekuci != null) {
			System.out.println("Podatak: " + tekuci.getPodatak());
			tekuci = tekuci.getSledeci();
		}	
	}

	@Override
	public boolean daLiPostoji(int podatak) {
		Cvor tekuci = glava;
		while(tekuci != null) {
			if(tekuci.getPodatak() == podatak)
				return true;
			tekuci = tekuci.getSledeci();
		}
		return false;
	}
	
	@Override
	 public int proveraKapaciteta() {
		 Cvor tekuci = glava;
		 int velicina = 0;
		 while(tekuci != null) {
			 velicina++;
			 tekuci = tekuci.getSledeci();
		 }
		 return velicina;
	 }
	
}
