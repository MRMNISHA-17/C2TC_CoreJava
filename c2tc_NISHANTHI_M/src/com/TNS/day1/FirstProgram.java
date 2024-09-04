package com.TNS.day1;

public class FirstProgram {
	void a(){
        System.out.println("hii");
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hii");
	    FirstProgram fp = new FirstProgram();
	    fp.a();
	    int a=3,b=5,c;
	    c=a+b;
	    //Arithmetic operators
	    System.out.println("The Addition of two numbers is :"+c);
	    c=a-b;
	    System.out.println("The Subtraction of two numbers is :"+c);
	    c=a*b;
	    System.out.println("The Multiplication of two numbers is :"+c);
	    c=a/b;
	    System.out.println("The Division of two numbers is :"+c);
	    c=a%b;
	    System.out.println("The Modulo of two numbers is :"+c);
	    //Inc&Dec operators
	    System.out.println(++a);
	    System.out.println(--a);
	    //Relational operators
	    System.out.println(a==b);
	    System.out.println(a!=b);
	    System.out.println(a<b);
	    System.out.println(a>b);
	    System.out.println(a<=b);
	    System.out.println(a>=b);
	    //Assignment operators
	    System.out.println(a=b);
	    System.out.println(a+=b);
	    System.out.println(a-+b);
	    System.out.println(a*=b);
	    System.out.println(a/=b);
	    System.out.println(a%=b);
	    //ternary operator
	    int d = (a > b)? a : b;  
	    System.out.println(d);
	    int max = (a > b) ? a : b;
        System.out.println("The maximum value is " + max);
	    System.out.println(c);
	    if(a>b) {
	    	System.out.println("True");
	    
	    }
	    else {
	    	System.out.println("False");
	    }

	}

}
