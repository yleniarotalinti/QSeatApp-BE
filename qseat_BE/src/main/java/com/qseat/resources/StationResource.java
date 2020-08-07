package com.qseat.resources;

import com.qseat.domain.entities.Booking;

import java.util.List;

public class StationResource {
    private String id_postazione;
    private boolean flag_prenotabile;
    private String destinazione;
    private String sede;
    private String piano;
    private List<Booking> bookings ;

    public String getId_postazione() {
        return id_postazione;
    }

    public void setId_postazione(String id_postazione) {
        this.id_postazione = id_postazione;
    }

    public boolean isFlag_prenotabile() {
        return flag_prenotabile;
    }

    public void setFlag_prenotabile(boolean flag_prenotabile) {
        this.flag_prenotabile = flag_prenotabile;
    }

    public String getDestinazione() {
        return destinazione;
    }

    public void setDestinazione(String destinazione) {
        this.destinazione = destinazione;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getPiano() {
        return piano;
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
