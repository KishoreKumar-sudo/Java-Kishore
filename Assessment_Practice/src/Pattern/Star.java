package Pattern;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no");
		int n=sc.nextInt();
		
		for (int i = 0; i <n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("*");
//				System.out.println();
			}
		}
	}

}
