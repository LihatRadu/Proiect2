package App;

import Database.MagazinDB;
import Clases.Returneaza;
import Clases.Cumpara;
import Clases.Lista;

import java.util.Scanner;
import java.io.IOException;
public class Main {

	public  Main() {
		try {
			
			Lista l = new Lista();
			
			System.out.println("Alege: ");
			boolean abandoneaza = false;
			int alege;
			Scanner s = new Scanner(System.in);
			alege = s.nextInt();
			if(alege == 0) {
				menu();
				Main ma = new Main();
			}
			else if(alege == 1) {
				l.afiseaza();
				Main ma = new Main();
				
			}else if(alege == 2) {
				/*Cumpara c = new Cumpara();
				c.adauga();*/
				Main ma = new Main();
			}
			else if(alege == 3) {
				inlocuieste();
				Main ma = new Main();
			}
			else if(alege == 4) {
				Returneaza r = new Returneaza();
				r.Returneaza();
				Main ma = new Main();
			}
			else if(alege == 5) {
				cautaProdus();
				Main ma = new Main();
			}
			else if(alege == 6) {
				return;
			}
			
			}catch(Exception e) {
				System.out.println("Error.");
			}
	}
	public static void main(String[] args) {
		Main m = new Main();
	}
	public static void menu() {
		System.out.println("0--Afisare optiuni");
		System.out.println("1 --Afiseaza produsele");
		System.out.println("2--Adauga in cos");
		System.out.println("3--Inlocuieste");
		System.out.println("4--Returneaza");
		System.out.println("5--Alege altceva");
		System.out.println("6--Abandoneaza");
		
	}
	public static void cautaProdus() {
		Lista l1 = new Lista();
		System.out.println("Produsul pe care-l cauti: ");
		String cautaProdus = new Scanner(System.in).nextLine();
		if(l1.cauta(cautaProdus,0) != null) {
			System.out.println("Gasit " + cautaProdus);
		}
		else {
			System.out.println("Nu ai gasit"+ cautaProdus);
		}
	}
	public static void inlocuieste() {
		Lista l2 = new Lista();
		int produs = new Scanner(System.in).nextInt();
		String denumire = new Scanner(System.in).nextLine();
		l2.modifica(produs-1, denumire);
	}
	MagazinDB mdb = new MagazinDB();

}
