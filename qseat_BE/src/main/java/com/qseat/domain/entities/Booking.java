package com.qseat.domain.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@IdClass(CompositeKey.class)
@Table(name="PRENOTAZIONI")
public class Booking {

    @Id
    @Column(name="data_prenotazione")
    public String data_prenotazione;

    @Id
    @Column(name="sede")
    public String sede;

    @Id
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "postazione_scrivania", referencedColumnName="id_postazione")
    public Station postazione_scrivania;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name="risorsa", referencedColumnName="email")
    public Person risorsa;

    public Booking(){

    }

   public Booking(String data_prenotazione, String sede, Station station, Person person) {
        this.data_prenotazione = data_prenotazione;
        this.sede = sede;
        this.postazione_scrivania = station;
        this.risorsa = person;
    }

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

    public Station getPostazione_scrivania() {
        return postazione_scrivania;
    }

    public void setPostazione_scrivania(Station postazione_scrivania) {
        this.postazione_scrivania = postazione_scrivania;
    }

    public void setStation(String id_station){ this.postazione_scrivania = new Station(id_station);}

    public Person getRisorsa() {
        return risorsa;
    }

    public void setRisorsa(Person risorsa) {
        this.risorsa = risorsa;
    }

    public void setPerson(String email){ this.risorsa = new Person(email);}
}
