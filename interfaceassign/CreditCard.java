package com.tnsif.interfaceassign;

public class CreditCard implements Payment{
   private String CardNo;
   
   

public CreditCard(String cardNo) {
	super();
	CardNo = cardNo;
}



@Override
public void process(double amt) {
	// TODO Auto-generated method stub
	
}
   
}
