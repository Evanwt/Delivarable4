package TestMethod;
import org.junit.*;
import slowLife.MainPanel;
import java.lang.reflect.*;
import static org.junit.Assert.assertEquals;

public class convertIntTest {
	
	private static Method convertToInt;			
	private static MainPanel panel;
	
	
	@BeforeClass
	public static void NewMethods() throws Exception {
			
		    convertToInt = MainPanel.class.getDeclaredMethod("convertToInt", int.class);
			convertToInt.setAccessible(true);
	}

	@Before
	public void newMainPanel() {
		
		panel = new MainPanel(15);
	}
	
	
	//Tests the maximum integer
	
		@Test
		public void testMaxValue() throws InvocationTargetException, IllegalAccessException {
			
			Object Object;
			int I;

				Object = convertToInt.invoke(panel, Integer.MAX_VALUE);
				
				I = (Integer) Object;
				assertEquals(I, Integer.MAX_VALUE);
				
		}
		
	
	//Tests zero
	 
		@Test
		public void testZero() throws InvocationTargetException, IllegalAccessException {
			
			Object Object;
			int I;
			
				Object = convertToInt.invoke(panel, 0);
				
				I = (Integer) Object;
				assertEquals(I, 0);
		}
		
		
	
   //Test  integer 10
	 
	 @Test
	 public void testRan() throws InvocationTargetException, IllegalAccessException {
		
	   	Object Object;
		int I;

			Object = convertToInt.invoke(panel, 15);
			I = (Integer) Object;
			assertEquals(I, 15);

	}
}
