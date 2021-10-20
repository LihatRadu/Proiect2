package Clases;
import Interfaces.Client;
import java.util.Scanner;

public abstract class Cumpara implements Client{

	private static Scanner scanner = new Scanner(System.in);
	private static Lista lista = new Lista();
	

	public void adauga() {
		lista.adauga(scanner.nextLine());
	}
	public void schimba() {
		int nrProdus = scanner.nextInt();
		scanner.nextLine();
		
		String produs = scanner.nextLine();
		lista.modifica(nrProdus, produs);
	}
}
