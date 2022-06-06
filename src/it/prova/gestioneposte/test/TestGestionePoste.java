package it.prova.gestioneposte.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import it.prova.gestioneposte.model.MockData;
import it.prova.gestioneposte.model.PostaDiPaese;

public class TestGestionePoste {

	public static void getDivisorio() {
		System.out.println(
				"-----------------------------------------------------------------------------------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<PostaDiPaese> listaPosteDiPaesiMock = MockData.LISTA_DI_PAESE;

		// Tutte le poste il cui indirizzo contenga “(MI)”
		System.out.println("tutte le poste il cui indirizzo contenga \"MI\"");
		listaPosteDiPaesiMock.forEach(listaItem -> {
			if (listaItem.getIndirizzoSede().contains("MI")) {
				System.out.println(listaItem.getDenominazione());
			} else {
				System.out.println("Non ci sono sedi che contengono 'MI'");
			}
		});

		getDivisorio();

		// tutte le poste che sono state aperte dopo il primo marzo 2019 (non usate
		// codice deprecato!!!);
		listaPosteDiPaesiMock.forEach(listaItem -> {
			try {
				if (listaItem.getDataApertura().after(new SimpleDateFormat("dd/MM/yyyy").parse("01/03/2019"))) {
					System.out.println(listaItem.getDenominazione());
				} else {
					System.out.println("Non ci sono Poste che sono state aperte dopo il 2019");
				}
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		getDivisorio();

		// la lista di indirizzi delle poste il cui numero dipendenti sia superiore a
		// 20;
		System.out.println("la lista di indirizzi delle poste il cui numero dipendenti sia superiore a 20");
		List<PostaDiPaese> listaPosteConNDipendentiSuperioreA20 = listaPosteDiPaesiMock.stream()
				.filter(listaItem -> listaItem.getnumeroDipendenti() > 20).collect(Collectors.toList());
		
		listaPosteConNDipendentiSuperioreA20.forEach(listaItem -> System.out.println(listaItem.getIndirizzoSede()));

	}

}
