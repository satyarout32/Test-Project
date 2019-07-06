package com.sr.beans;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	//composition
	private Dtdc dtdc;
	
	//0-param Constructor
	public Flipkart(Dtdc dtdc) {
		System.out.println("Flipkart.Flipkart() 0-param Constructor...");
		this.dtdc=dtdc;
	}
	
	//B.logic
	public String shopping(String[] items,float prices[]) {
		System.out.println("Flipkart.shopping()");
		float billAmt=0.0f;
		Random rad=null;
		int oid=0;
		String msg=null;
		
		//generate bill
		for(float price:prices)
		billAmt=billAmt+price;
		
		//generate order id
		oid=new Random().nextInt(100000);
		
		msg=dtdc.deliver(oid);
		return Arrays.toString(items)+"having prices"+Arrays.toString(prices);
	}
	
	
}
