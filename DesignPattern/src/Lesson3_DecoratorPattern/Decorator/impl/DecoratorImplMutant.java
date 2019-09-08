package Lesson3_DecoratorPattern.Decorator.impl;

import Lesson3_DecoratorPattern.Decorator.Decorator;

public class DecoratorImplMutant extends DecoratorSuper{
 private String number;
 
     public DecoratorImplMutant(Decorator decorator) {
    	 this.decorator=decorator;
     }
     
     public void setNumber(String number) {
    	 this.number=number;
     }
     
     public String getNumber() {
    	 return this.number;
     }
     
 
	 public void decorate() {
		 printImplMuntant();
		 super.decorate();
	 }
		//custom method 
		public void printImplMuntant() {
			System.out.println("decorate from Muntant:"+number);
		}
	 
	
}
