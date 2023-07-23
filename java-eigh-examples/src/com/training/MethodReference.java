package com.training;

interface MyInterface{ 
    Hello display(String say); 
} 

class Hello{ 
    
	public Hello(String say){ 
	   System.out.print(say); 
	 } 
} 


public class MethodReference {

	public static void main(String[] args) {
		
		MyInterface dummy = (msg)->  new Hello(msg);
		
		dummy.display("Hello World");
		
		
		 MyInterface ref = Hello::new; 
		    ref.display("Hello World!"); 

	}

}
