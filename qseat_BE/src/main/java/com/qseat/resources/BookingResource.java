package com.qseat.resources;

import com.qseat.domain.entities.Person;
import com.qseat.domain.entities.Station;


public class BookingResource {
    private String data_prenotazione, sede ;
    private Station postazione;
    private Person risorsa;


    public String getData_prenotazione() {
        return data_prenotazione;
    }

    public String getSede() {
        return sede;
    }


    public void setData_prenotazione(String data_prenotazione) {
        this.data_prenotazione = data_prenotazione;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public Station getPostazione() {
        return this.postazione;
    }

    public void setPostazione(Station postazione) {
        this.postazione = postazione;
    }

    public Person getRisorsa() {
        return this.risorsa;
    }

    public void setRisorsa(Person risorsa) {
        this.risorsa = risorsa;
    }

    public BookingResource(String data_prenotazione, String sede, Station postazione, Person risorsa) {
        this.data_prenotazione = data_prenotazione;
        this.sede = sede;
        this.postazione = postazione;
        this.risorsa = risorsa;
    }

    public BookingResource(){};
}
