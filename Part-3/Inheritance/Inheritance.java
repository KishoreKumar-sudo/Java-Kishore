class Parent{
	public void m1(){
		System.out.println("Parent class - m1()");
	}
	public void m2(){
		System.out.println("Parent class - m2()");
	}
}
class Child extends Parent{
	public void m3(){
		System.out.println("Child class - m3()");
	}
} 
class Inheritance{
	public static void main (String[] args){
			Child 				obj1 			 = new Child();     //Mostly used method
		//Reference Type 	Reference Variable 		Object Creation 
		obj1.m1();
		obj1.m2();
		obj1.m3();
		System.out.println("Child can hold child class");
	
	 Parent obj2 = new Child();
	 obj2.m1();
	 obj2.m2();
	 //obj2.m3();
	 System.out.println("Parent can hold child class");
	 
	 Parent obj3= new Parent();    	// Rarely used method
	 obj3.m1();
	 obj3.m2();
	 //obj3.m3();
	 System.out.println("Parent can hold Parent class");
	 
	 //Child obj4= new Parent(); incompatible types: Parent cannot be converted to Child
	}
}
