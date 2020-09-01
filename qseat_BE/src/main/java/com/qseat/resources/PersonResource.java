package com.qseat.resources;


import com.qseat.domain.entities.Booking;

import java.util.List;

public class PersonResource {
    private String email, nome_breve, nome_esteso, nome, cognome,
                    ruolo, data_assunzione, data_uscita, insert_timestamp;
    private List<Booking> bookings;

    public String getEmail() {
        return email;
    }

    public String getNome_breve() {
        return nome_breve;
    }

    public String getNome_esteso() {
        return nome_esteso;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getRuolo() {
        return ruolo;
    }

    public String getData_assunzione() {
        return data_assunzione;
    }

    public String getData_uscita() {
        return data_uscita;
    }

    public String getInsert_timestamp() {
        return insert_timestamp;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome_breve(String nome_breve) {
        this.nome_breve = nome_breve;
    }

    public void setNome_esteso(String nome_esteso) {
        this.nome_esteso = nome_esteso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public void setData_assunzione(String data_assunzione) {
        this.data_assunzione = data_assunzione;
    }

    public void setData_uscita(String data_uscita) {
        this.data_uscita = data_uscita;
    }

    public void setInsert_timestamp(String insert_timestamp) {
        this.insert_timestamp = insert_timestamp;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

}
