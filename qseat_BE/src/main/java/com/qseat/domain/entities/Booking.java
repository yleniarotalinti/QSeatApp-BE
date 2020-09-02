package com.qseat.domain.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
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
    public Station station ;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name="risorsa", referencedColumnName="email")
    public Person person;

    public Booking(){

    }

   public Booking(String data_prenotazione, String sede, Station station, Person person) {
        this.data_prenotazione = data_prenotazione;
        this.sede = sede;
        this.station = station;
        this.person = person;
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

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public void setStation(String id_station){ this.station = new Station(id_station);}

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setPerson(String email){ this.person = new Person(email);}
}
