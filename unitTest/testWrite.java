package TestMethod;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import slowLife.Cell;

public class testWrite {

	//Test cell changed from dead to alive returns "X", alive
	@Test
	public void testalive1() {
		
		Cell nC = new Cell(false);
		nC.setAlive(true);
		String s = nC.toString();
		
		assertEquals(s, "X");
	}
	
	//Test cell with the parameter true returns "X",alive
	@Test
	public void testalive2() {

		Cell nC = new Cell(true);
		String s = nC.toString();

		assertEquals(s, "X");
	}
	
	
	
	// Test cell changed from alive to dead returns ".", dead
	@Test
	public void testDead1() {
		
		Cell nC = new Cell(true);
		nC.setAlive(false);
		String s = nC.toString();
		
		assertEquals(s, ".");
	}
	
	
	//Test cell with the parameter false returns ".", dead
	@Test
	public void testDead2() {

		Cell nC = new Cell();
		String s = nC.toString();

		assertEquals(s, ".");
	}
}
