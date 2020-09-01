package com.qseat.domain.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="POSTAZIONI")
public class Station {

    @Id
    @Column(name="id_postazione", nullable=false)
    private String id_postazione;

    @Column(name="flag_prenotabile", nullable=false)
    private boolean flag_prenotabile;

    @Column(name="destinazione", nullable=true)
    private String destinazione;

    @Column(name="sede", nullable=true)
    private String sede;

    @Column(name="piano", nullable=true)
    private String piano;

    //@JsonManagedReference
    @OneToMany(mappedBy = "station")
    private  List<Booking> bookings;

    public Station(){

    }

    public Station(String id_postazione, boolean flag_prenotabile, String destinazione, String sede, String piano) {
        this.id_postazione = id_postazione;
        this.flag_prenotabile = flag_prenotabile;
        this.destinazione = destinazione;
        this.sede = sede;
        this.piano = piano;
    }

    public Station(String id_postazione) {
        this.id_postazione = id_postazione;
    }

    public String getId_postazione() {
        return id_postazione;
    }

    public boolean isFlag_prenotabile() {
        return flag_prenotabile;
    }

    public String getDestinazione() {
        return destinazione;
    }

    public String getSede() {
        return sede;
    }

    public String getPiano() {
        return piano;
    }

    public void setId_postazione(String id_postazione) {
        this.id_postazione = id_postazione;
    }

    public void setFlag_prenotabile(boolean flag_prenotabile) {
        this.flag_prenotabile = flag_prenotabile;
    }

    public void setDestinazione(String destinazione) {
        this.destinazione = destinazione;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public void setPiano(String piano) {
        this.piano = piano;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
