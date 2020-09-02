package com.qseat.resources;

import com.qseat.domain.entities.Station;

public class BookingResourceNew {
    private String data_prenotazione, sede ;
    private String postazione;
    private String risorsa;

    public String getData_prenotazione() {
        return data_prenotazione;
    }

    public void setData_prenotazione(String data_prenotazione) {
        this.data_prenotazione = data_prenotazione;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getPostazione() {
        return postazione;
    }

    public void setPostazione(String postazione) {
        this.postazione = postazione;
    }

    public String getRisorsa() {
        return risorsa;
    }

    public void setRisorsa(String risorsa) {
        this.risorsa = risorsa;
    }

    public BookingResourceNew(String data_prenotazione, String sede, String postazione, String risorsa) {
        this.data_prenotazione = data_prenotazione;
        this.sede = sede;
        this.postazione = postazione;
        this.risorsa = risorsa;
    }
}
