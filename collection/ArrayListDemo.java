package collection;
import java.util.*;
import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<Integer> list=new ArrayList<Integer>(); //raw type
		
		System.out.println("The size of the arraylist is:" +list.isEmpty());
       list.add(200);
       list.add(3);
       list.add(7);
       
      list.add(100);
      //System.out.print(list);
    
      System.out.print(list);
      Collections.sort(list);
      System.out.print(list);
	}

}
