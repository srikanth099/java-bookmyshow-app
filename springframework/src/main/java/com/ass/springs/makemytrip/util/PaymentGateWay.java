package com.ass.springs.makemytrip.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope("prototype")//prototype:its can decide how many objects are created by container every we request an object by using getBean(),
//request:every request its going to create new new objects (options in Applications)
//session:if we click login button some times banking application s get asking re-login my session with the concept of duration(HTTP session)it we be treated as one single session 
//global:
@Scope("singleton") // it will created only one object of this class"paymentGateWay" by container
@Component // class level Annotation, @component to create a object of the class by spring
			// core
public class PaymentGateWay {

	@Value("BOB889787582Y") // static values if we can insert dynamically at run time we use setters
							// methods,
	private String cardNumber;

	@Value("srikanth@bob.com") // static values if we can insert dynamically at run time we use setters
								// methods,
	private String userName;

	public PaymentGateWay() {

		System.out.println(this.getClass().getSimpleName() + "class object created");
	}

	public void makePayment() {
		System.out.println("payment made successfully!!");
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "PaymentGateWay [cardNumber=" + cardNumber + ", userName=" + userName + "]";
	}

}
