package com.qseat.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(CompositeKey.class)
@Table(name="PRENOTAZIONI")
public class Booking {
    @Id
    @Column(name="data_prenotazione", nullable=false)
    private String data_prenotazione;

    @Id
    @Column(name="sede", nullable=false)
    private String sede;

    @Id
    @Column(name="postazione_scrivania", nullable=false)
    private String postazione_scrivania;

    @Column(name="risorsa", nullable=false)
    private String risorsa;

    public Booking(){

    }

    public Booking(String data_prenotazione, String sede, String postazione_scrivania, String risorsa) {
        this.data_prenotazione = data_prenotazione;
        this.sede = sede;
        this.postazione_scrivania = postazione_scrivania;
        this.risorsa = risorsa;
    }

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
