package com.TNS.day3;

public class ModifierClass {
	public int publicVar = 100;
	protected int protectedVar = 200;
	int defaultVar = 300; // package-private
	private int privateVar = 400;

	public void publicMethod() {
		System.out.println("Public method: " + publicVar);
	}

	protected void protectedMethod() {
		System.out.println("Protected method: " + protectedVar);
	}

	void defaultMethod() {
	    System.out.println("Default method: " + defaultVar);
	}

	private void privateMethod() {
		System.out.println("Private method: " + privateVar);
	}

	public static void main(String[] args) {
		ModifierClass obj = new ModifierClass();

	        // Access all methods from within the same class
		obj.publicMethod();     // Accessible everywhere
	    obj.protectedMethod();  // Accessible within package and subclasses
	    obj.defaultMethod();    // Accessible within package
	    obj.privateMethod();    // Accessible only within this class
   }



}
