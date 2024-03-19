package interfejsKolekcije;

public interface InterfejsKolekcije {
	// interfejs kolekcija , sa osnovnim metodama pri upravljanju kolekcijama
	public void dodaj(int podatak);
	public void izbaci(int podatak);
	public void prikazi();
	public boolean daLiPostoji(int podatak);
	public int proveraKapaciteta();
	
}
