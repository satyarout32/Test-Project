package com.sr.beans;

public class Bluedart {
	public Bluedart() {
		System.out.println("Bluedart.Bluedart()");
	}

	public final String deliver(int oid) {
		return "Your order is just about to deliver by DTDC Courier boy!!!   Be  Ready to receive your order id" + oid;
	}
}
