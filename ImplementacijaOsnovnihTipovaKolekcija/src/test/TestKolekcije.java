package test;

import kolekcije.*;

public class TestKolekcije {
// testovi 
	public static void main(String[] args) {
		System.out.println("**************************************************");
		System.out.println("*********************FIFO*************************");
		System.out.println("**************************************************");
		Fifo fifo = new Fifo();
		fifo.dodaj(1);
		fifo.dodaj(2);
		fifo.dodaj(3);
		fifo.prikazi();
		System.out.println("------------------------------------------------");
		fifo.izbaci(2);
		fifo.prikazi();
		System.out.println(fifo.daLiPostoji(5));
		System.out.println(fifo.proveraKapaciteta());
		System.out.println();
		
		
		
		System.out.println("**************************************************");
		System.out.println("*********************LIFO*************************");
		System.out.println("**************************************************");
		Lifo lifo = new Lifo();
		lifo.dodaj(4);
		lifo.dodaj(5);
		lifo.dodaj(6);
		lifo.dodaj(10);
		lifo.prikazi();
		System.out.println("------------------------------------------------");
		lifo.izbaci(5);
		lifo.prikazi();
		System.out.println(fifo.daLiPostoji(5));
		System.out.println(fifo.proveraKapaciteta());
		System.out.println();
	
		
		
		System.out.println("**************************************************");
		System.out.println("*********************SKUP*************************");
		System.out.println("**************************************************");
		Skup skup = new Skup();
		skup.dodajNaKraj(8);
		skup.dodajNaPocetak(12);
		skup.dodajNaPocetak(12);
		skup.dodajNaKraj(10);
		skup.dodaj(11);
		skup.prikazi();
		System.out.println("------------------------------------------------");
		skup.izbaci(2);
		skup.prikazi();
		System.out.println(skup.daLiPostoji(5));
		System.out.println(skup.proveraKapaciteta());
		
		
		
	}

}
