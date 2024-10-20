package com.ass.springs.makemytrip.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
@Component
public class BookTicket {

	// paymentgateway is a class it id going to be referance
	// dependency injection meanse reqiured reference
	// there is a requres in the class by using done with 1)property injection 2)constructor injection
	// +class paymentgatewat{ +class bookticket{ @Autowuired
	// PaymentGateWay(required) gateway(referance)=new ();
	
	@Autowired
	private PaymentGateWay gateway;

	public BookTicket() {
		System.out.println(this.getClass().getSimpleName() + " class object created");
	}

	@Override
	public String toString() {
		return "BookTicket [gateway=" + gateway + "]";
	}

}