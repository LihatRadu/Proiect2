package Clases;

import App.Main;
import java.util.Scanner;

public class Returneaza {

	public  void Returneaza() {
		Lista lista = new Lista();
		int nrProdus;
		Scanner scan = new Scanner(System.in);
		nrProdus = scan.nextInt();
		scan.nextLine();
		
		lista.scoate(nrProdus - 1);
		
		
		try {
		Scanner sc = new Scanner(System.in);	
		int intoarcere;
		intoarcere = sc.nextInt();
		if(intoarcere == 4) {
			Main m = new Main();
		}
		}catch(Exception e) {
			System.out.println("Erro2.");
		}
	}
}
