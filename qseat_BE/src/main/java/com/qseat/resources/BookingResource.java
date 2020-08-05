package com.qseat.resources;

public class BookingResource {
    private String data_prenotazione, sede, postazione_scrivania, risorsa ;

    public String getData_prenotazione() {
        return data_prenotazione;
    }

    public String getSede() {
        return sede;
    }

    public String getPostazione_scrivania() {
        return postazione_scrivania;
    }

    public String getRisorsa() {
        return risorsa;
    }

    public void setData_prenotazione(String data_prenotazione) {
        this.data_prenotazione = data_prenotazione;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public void setPostazione_scrivania(String postazione_scrivania) {
        this.postazione_scrivania = postazione_scrivania;
    }

    public void setRisorsa(String risorsa) {
        this.risorsa = risorsa;
    }
}
