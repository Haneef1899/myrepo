package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class LaptopDemo {
	
	
	public static void main(String args[]) {
		List <Laptop> laps= new ArrayList<Laptop>();
		laps.add(new Laptop("dell",15,16999));
		laps.add(new Laptop("asus",22,17877));
		laps.add(new Laptop("hp",32,32000));
		Collections.sort(laps);
		for(Laptop l: laps) {
			System.out.println(l);
			
		}
	}

}
