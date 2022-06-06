package it.prova.gestioneposte.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostaDiPaese {
	
	private String denominazione;
	private String indirizzoSede;
	private Date dataApertura;
	private Integer numeroDipendenti;
	private List<Destinatario> destinatari = new ArrayList<Destinatario>();
	
	public PostaDiPaese() {
		super();
	}

	public PostaDiPaese(String denominazione, String indirizzoSede, Date dataApertura, Integer numeroDipendenti) {
		super();
		this.denominazione = denominazione;
		this.indirizzoSede = indirizzoSede;
		this.dataApertura = dataApertura;
		this.numeroDipendenti = numeroDipendenti;
	}

	public PostaDiPaese(String denominazione, String indirizzoSede, Date dataApertura, Integer numeroDipendenti,
			List<Destinatario> destinatari) {
		super();
		this.denominazione = denominazione;
		this.indirizzoSede = indirizzoSede;
		this.dataApertura = dataApertura;
		this.numeroDipendenti = numeroDipendenti;
		this.destinatari = destinatari;
	}

	public String getDenominazione() {
		return denominazione;
	}

	public void setDenominazione(String denominazione) {
		this.denominazione = denominazione;
	}

	public String getIndirizzoSede() {
		return indirizzoSede;
	}

	public void setIndirizzoSede(String indirizzoSede) {
		this.indirizzoSede = indirizzoSede;
	}

	public Date getDataApertura() {
		return dataApertura;
	}

	public void setDataApertura(Date dataApertura) {
		this.dataApertura = dataApertura;
	}

	public Integer getnumeroDipendenti() {
		return numeroDipendenti;
	}

	public void setnumeroDipendenti(Integer numeroabitanti) {
		this.numeroDipendenti = numeroabitanti;
	}

	public List<Destinatario> getDestinatari() {
		return destinatari;
	}

	public void setDestinatari(List<Destinatario> destinatari) {
		this.destinatari = destinatari;
	}
	
}
