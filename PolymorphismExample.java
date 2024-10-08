package com.hexaware.oops;

 class Payment {
	void payment(String aadharNo , String payTmNo)
	{
		System.out.println("Payment Method called from Parent Class- PAY TM");
		System.out.println("Payment processing done ... ");
		
	}

}
class DummyClass extends Payment {



 void payment(String aadharNo , String payTmNo, double bonus)

	{
	    super.payment("sdfdf", "skhflks");
	    System.out.println("The bonus is :" + bonus);
		System.out.println("Payment Method called from Dummy Class- PAY TM");
		System.out.println("Payment processing done ... ");
		
	}
}
public class PolymorphismExample {

public static void main(String[] args) {
//virtual method invocation
DummyClass p = new DummyClass();
//p.payment(5576);
//p.payment(23243, "234@rt");
//It is undefined for the Parent
p.payment("342@upi", "789056" , 4000);
}





}


