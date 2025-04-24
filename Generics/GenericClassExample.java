package com.tns.Generics;
class Box<T>{
	private T value;
	
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value=value;
	}
}
public class GenericClassExample {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Box<Integer> intBox=new Box<>();
     intBox.setValue(100);
     System.out.println("Integer value" +intBox.getValue());
	}

}
