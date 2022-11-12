//MethodOverloading(Mtd-Signature)
	//Method names are same/ deals within the same class + D/f Arguments list

class K{
	public void m1(int d){
		System.out.println("m1()- int argument");
	}
	public void m2(float e){
		System.out.println("m2()- float argument");
	}
	public void m3(double g){
		System.out.println("m3()- double argument");
	}
	public static void main(String[] args){
		K k= new K();
		k.m1(29);
		k.m2(29.05f);
		k.m3(29.5);
	}
}