DROP TABLE IF EXISTS ANAGRAFICA;

CREATE TABLE ANAGRAFICA1 (
    email varchar(255) PRIMARY KEY,
    nome_breve varchar(255),
    nome_esteso varchar(255),
    nome varchar(255),
    cognome varchar(255),
    ruolo varchar(255),
    data_assunzione varchar(255),
    data_uscita varchar(255),
    insert_timestamp varchar(255)
);

CREATE TABLE POSTAZIONI1 (
    id_postazione varchar(255) PRIMARY KEY,
    flag_prenotabile boolean,
    destinazione varchar(255),
    sede varchar(255),
    piano varchar (255)
    );


CREATE TABLE PRENOTAZIONI1 (
	data_prenotazione varchar(255),
	sede varchar(255),
	id_postazione varchar(255),
	risorsa varchar(255),
	CONSTRAINT pk PRIMARY KEY (data_prenotazione, sede, id_postazione),
	FOREIGN KEY (id_postazione) REFERENCES POSTAZIONI (id_postazione),
	FOREIGN KEY (sede) REFERENCES POSTAZIONI (sede)

);


