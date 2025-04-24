import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
public class MyTest {
    @DisplayName("Testing")
	@Test
	void display() {
		System.out.println("My Program ");
		}
    
    @RepeatedTest(2)
    @DisplayName("2nd Test")
    @Test
    void another() {
    	System.out.println("My program 2");
    }
}
