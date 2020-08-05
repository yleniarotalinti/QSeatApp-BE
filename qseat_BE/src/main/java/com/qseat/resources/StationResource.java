package com.qseat.resources;

public class StationResource {
    private String id_postazione;
    private boolean flag_prenotabile;
    private String destinazione;
    private String sede;
    private String piano;


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

    public String getId_postazione() {
        return id_postazione;
    }

    public void setId_postazione(String id_postazione) {
        this.id_postazione = id_postazione;
    }
}
