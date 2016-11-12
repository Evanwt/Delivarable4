package TestMethod;
import org.junit.*;
import slowLife.MainPanel;
import static org.junit.Assert.assertEquals;


public class testRC {
	
	
	private static MainPanel panel;

	@Before
	public void NewMainPanel() {

		panel = new MainPanel(15);
	}

	//Tests the initial _r is 1000
	
	@Test
	public void testMaxCount() {

		int r = panel._r;

		assertEquals(r, 1000);
	}
	
	//Tests the panel size is 15
	
	@Test
	public void testSize() {

		assertEquals(panel.getCellsSize(), 15);
	}

	
}
