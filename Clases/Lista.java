package Clases;

import java.util.ArrayList;
import Interfaces.Client;

public class Lista{

	private ArrayList<String> pieseLista = new ArrayList<String>();
	
	public void adauga(String produs) {
		pieseLista.add(produs);
	}
	public void modifica(int pozitie, String denumire) {
		pieseLista.add(pozitie, denumire);
	}
	public void scoate(int pozitie) {
		String produs = pieseLista.get(pozitie);
		pieseLista.remove(pozitie);
	}
	
	public String cauta(String cautaProduse, int pozitie) {
		 pozitie = pieseLista.indexOf(cautaProduse);
		
		if(pozitie >= 0) {
			return pieseLista.get(pozitie);
		}
		return null;
	}
	
	public void afiseaza() {
		int p;
		System.out.println("Ai ales" + pieseLista.size() + "pentru a le cumpara");
		
		for(p = 0; p < pieseLista.size(); p++) {
			System.out.println((p+1) + pieseLista.get(p));
		}
	}
}
