package com.sr.beans;

public class Dtdc {
	Dtdc() {
		System.out.println("Dtdc.Dtdc()");
	}

	public final String deliver(int oid) {
		return "Your order is just about to deliver by DTDC Courier boy!!!   Be  Ready to receive your order id:" + oid;
	}

}
