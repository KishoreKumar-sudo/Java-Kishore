
class B{
	
	//public void m1(int a, double c) temporary variables(if u give these it can't access d/f datatype)
	public void m1(double c){
		System.out.println("m1 method -double arg" + c);
	}
	
	public static void main(String[] args){
		B b = new B();
		b.m1(10);
		b.m1(10.5f);
		b.m1(10.5);
	}
	//Checking exactly matching variable is there or not
}
