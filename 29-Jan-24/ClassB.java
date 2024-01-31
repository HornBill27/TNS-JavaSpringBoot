package com.Achilles;

public class ClassB extends ClassA{
	void meth1() {
		System.out.println("ClassB");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ClassA aobj= new ClassA();
//		aobj.meth1();
//		
		ClassA aobj1=new ClassB();
		aobj1.meth1();
//		
//		ClassB bobj = new ClassB();
//		bobj.meth1();
//		bobj.m2();
		
		
	}

}
