package pis2.ejercicio;

import org.junit.Test;

import junit.framework.TestCase;

public class TestEjercicio extends TestCase {

	@Test
	public void test() {
		Movie movie1 = new Movie("Monty Python and the Holy Grail", 0);
		Movie movie2 = new Movie("Ice Age", 2);

		Customer yo = new Customer("Isa");
		Rental r1 = new Rental(movie1, 10);
		Rental r2 = new Rental(movie2, 2);

		yo.addRental(r1);
		yo.addRental(r2);

		String res = "Rental Record for " + "Isa" + "\n" + "\tMonty Python and the Holy Grail\t14.0" + "\n"
				+ "\tIce Age\t1.5" + "\n" + "Amount owed is 15.5" + "\n" + "You earned 2 frequent renter points";
		assertEquals(res, yo.statement());
	}

}
