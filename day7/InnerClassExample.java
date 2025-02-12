package com.celcom.day7;

interface MyInterface{
	void display();
}
public class InnerClassExample implements MyInterface{

	//non-static inner class
	class InnerClass1 {
		void myMethod1() {
			System.out.println("Non-Static Inner Class");
		}
	}
		//static inner class
		static class InnerClass2{
			void myMethod2() {
				System.out.println("Static Inner Class");
			}
		}
	
		void myMethod() {
			//3.Local inner class
			class InnerClass3{
				void myMethod3() {
					System.out.println("Local Inner Class");
				}
			}
			InnerClass3 inner3=new InnerClass3();
			inner3.myMethod3();
		}
		public void display() {
			System.out.print("Anonymous inner class");
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClassExample obj=new InnerClassExample();
		InnerClass1 inner1=obj.new InnerClass1();
		inner1.myMethod1();
		
		InnerClassExample.InnerClass2 inner2=new InnerClassExample.InnerClass2();
		inner2.myMethod2();
		obj.myMethod();
		obj.display();
		//in anonymous no implementing class is requires
		MyInterface obj1=new MyInterface() {
			public void display() {
				System.out.println("display");
			}
		};
		obj1.display();
		
		//Lambda Expression
		MyInterface obj2=()->System.out.println("Display");
		obj2.display();
	}

}
