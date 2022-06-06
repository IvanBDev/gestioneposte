package it.prova.gestioneposte.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class MockData {

	public static final List<PostaDiPaese> LISTA_DI_PAESE = new ArrayList<PostaDiPaese>();

	static {

		try {
			PostaDiPaese ufficioPostaleRoma = new PostaDiPaese("Ufficio Postale Roma", "Via Dell'Imperatore 136",
					new SimpleDateFormat("dd/MM/yyyy").parse("04/09/1975"), 9);
			Destinatario destinatarioMarco = new Destinatario("Marco", "Aprili", 35, "Via della Verita 12", true, ufficioPostaleRoma);
			ufficioPostaleRoma.getDestinatari().add(destinatarioMarco);
			Destinatario destinatarioFrancesca = new Destinatario("Francesca", "Molieri", 38, "Via Felice 33", true, ufficioPostaleRoma);
			ufficioPostaleRoma.getDestinatari().add(destinatarioFrancesca);
			Destinatario destinatarioArianna = new Destinatario("Arianna", "Piccola", 44, "Via Grandi Musei 88", true, ufficioPostaleRoma);
			ufficioPostaleRoma.getDestinatari().add(destinatarioArianna);
			
			PostaDiPaese ufficioPostaleNapoli = new PostaDiPaese("Ufficio Postale Napoli", "Via Salari 49",
					new SimpleDateFormat("dd/MM/yyyy").parse("12/05/1970"), 62);
			Destinatario destinatarioDanilo = new Destinatario("Danilo", "Meloni", 15, "Via Flavienschi 80", false, ufficioPostaleNapoli);
			ufficioPostaleNapoli.getDestinatari().add(destinatarioDanilo);
			Destinatario destinatarioAngela = new Destinatario("Angela", "Feroni", 10, "Via Domitilla 41", false, ufficioPostaleNapoli);
			ufficioPostaleNapoli.getDestinatari().add(destinatarioAngela);
			
			PostaDiPaese ufficioPostaleVenezia = new PostaDiPaese("Ufficio Postale Venezia", "Via Grezzari 71",
					new SimpleDateFormat("dd/MM/yyyy").parse("01/03/1972"), 80);
			Destinatario destinatarioMaria = new Destinatario("Maria", "Lenda", 13, "Via Flavienschi 80", false, ufficioPostaleVenezia);
			ufficioPostaleVenezia.getDestinatari().add(destinatarioMaria);
			Destinatario destinatarioFlavio = new Destinatario("Flavio", "Girolami", 50, "Via Girandola 15", true, ufficioPostaleVenezia);
			ufficioPostaleVenezia.getDestinatari().add(destinatarioFlavio);
			Destinatario destinatarioIvan = new Destinatario("Ivan", "Bendotti", 19, "Via Firenze 112", true, ufficioPostaleVenezia);
			ufficioPostaleVenezia.getDestinatari().add(destinatarioIvan);
			Destinatario destinatarioGianluca = new Destinatario("Gianluca", "Vieira", 20, "Via Odescalchi 6", true, ufficioPostaleVenezia);
			ufficioPostaleVenezia.getDestinatari().add(destinatarioGianluca);
			
			LISTA_DI_PAESE.add(ufficioPostaleRoma);
			LISTA_DI_PAESE.add(ufficioPostaleNapoli);
			LISTA_DI_PAESE.add(ufficioPostaleVenezia);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
