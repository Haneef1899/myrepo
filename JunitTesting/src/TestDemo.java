import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;
public class TestDemo {

	@Test
	public void checkassertequal (){
		int res=1;
		int exp=1;
		assertEquals(res,exp);
	}
	
	@Test
	public void check() {
		assertTrue("Hello".contains("H"));
	}
	@Test
	public void another() {
		String s="hello";
		assertNull(s);
	}
	
	
	
	
	//assumptions
	@Test
	public void testassuption() {
		int a=5,s=25;
		//Assumptions.assumeTrue(s==a*a);
		//Assumptions.assumeTrue(s==a*a);
		System.out.println("Hi");
		
	}
}
