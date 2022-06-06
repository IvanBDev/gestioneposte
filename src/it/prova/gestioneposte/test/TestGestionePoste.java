package it.prova.gestioneposte.test;

import java.util.List;

import it.prova.gestioneposte.model.MockData;
import it.prova.gestioneposte.model.PostaDiPaese;

public class TestGestionePoste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<PostaDiPaese> listaPosteDiPaesiMock = MockData.LISTA_DI_PAESE;

		// Tutte le poste il cui indirizzo contenga “(MI)”
		System.out.println("tutte le poste il cui indirizzo contenga \"MI\"");
		listaPosteDiPaesiMock.forEach(listaItem -> {
			if(listaItem.getIndirizzoSede().contains("MI")) {
				System.out.println(listaItem.getDenominazione());
			}
			else {
				System.out.println("Non ci sono sedi che contengono 'MI'");
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
