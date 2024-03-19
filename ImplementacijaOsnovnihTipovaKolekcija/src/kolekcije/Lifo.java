package kolekcije;

public class Lifo extends Kolekcija{
	
	public void izbaci() {
        if (glava == null) {
            throw new IllegalStateException("Red je prazan.");
        }
        glava = glava.getSledeci();
	}
	
}
