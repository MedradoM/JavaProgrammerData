package exercicio;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean a, b, monkeyTrouble;
		
		System.out.println("como está o humor do macaco a");
		a = sc.nextBoolean();
		System.out.println("como está o humor do macaco b");
		b = sc.nextBoolean();
		
		
		if (a == b) {
			monkeyTrouble = true;
			System.out.println(monkeyTrouble);
		} else {
			monkeyTrouble = false;
			System.out.println(monkeyTrouble);
			
		}
		
		sc.close();
	}

}
