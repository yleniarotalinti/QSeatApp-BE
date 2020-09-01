package com.qseat.domain.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="ANAGRAFICA")
public class Person {

    @Id
    @Column(name="email", nullable=false)
    private String email;

    @Column(name="nome_breve", nullable=true)
    private String nome_breve;

    @Column(name="nome_esteso", nullable=true)
    private String nome_esteso;

    @Column(name="nome", nullable=true)
    private String nome;

    @Column(name="cognome", nullable=true)
    private String cognome;

    @Column(name="ruolo", nullable=true)
    private String ruolo;

    @Column(name="data_assunzione", nullable=true)
    private String data_assunzione;

    @Column(name="data_uscita", nullable=true)
    private String data_uscita;

    @Column(name="insert_timestamp", nullable=true)
    private String insert_timestamp;

    @JsonManagedReference
    @OneToMany(mappedBy="person")
    List<Booking> bookings;

    public Person() {
    }

    public Person(String email, String nome, String cognome, String data_assunzione) {
        this.email = email;
        this.nome = nome;
        this.cognome = cognome;
        this.data_assunzione = data_assunzione;
    }

    public Person(String email, String nome, String cognome, String data_assunzione, String data_uscita) {
        this.email = email;
        this.nome = nome;
        this.cognome = cognome;
        this.data_assunzione = data_assunzione;
        this.data_uscita = data_uscita;
    }

    public Person(String email) {
        this.email = email;
    }

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
