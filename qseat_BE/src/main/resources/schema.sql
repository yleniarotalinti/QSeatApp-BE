DROP TABLE IF EXISTS ANAGRAFICA;

CREATE TABLE ANAGRAFICA (
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

/*
INSERT INTO ANAGRAFICA (email, nome, cognome, data_assunzione, data_uscita) VALUES
    ('ylenia.rotalinti@quantyca.it', 'Ylenia', 'Rotalinti', '2020-07-01', null),
    ('marta.brunetti@quantyca.it', 'Marta', 'Brunetti', '2020-07-01', null),
    ('matteo.colella@quantyca.it', 'Matteo', 'Colella', '2020-07-01', null),
    ('matteo.borghi@quantyca.it', 'Matteo', 'Borghi', '2015-06-01', '2020-05-01');
*/


CREATE TABLE POSTAZIONI (
    id_postazione varchar(255) PRIMARY KEY,
    flag_prenotabile boolean,
    destinazione varchar(255),
    sede varchar(255),
    piano varchar (255)
    );


CREATE TABLE PRENOTAZIONI (
	data_prenotazione varchar(255),
	sede varchar(255),
	postazione_scrivania varchar(255),
	risorsa varchar(255),
	CONSTRAINT pk PRIMARY KEY (data_prenotazione, sede, postazione_scrivania)
);


/*
CREATE TABLE `calendar` (
`cdate` date NOT NULL DEFAULT '2000-01-01',
`cday` int(2) unsigned NOT NULL DEFAULT '1',
`cmonth` int(2) unsigned NOT NULL DEFAULT '1',
`cyear` int(4) unsigned NOT NULL DEFAULT '2000',
PRIMARY KEY (`cdate`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE ints (i INTEGER);
INSERT INTO ints VALUES (0), (1), (2), (3), (4), (5), (6), (7), (8), (9);

INSERT INTO calendar (cdate, cday, cmonth, cyear)
SELECT cal.date as cdate, DAY(cal.date) as cday, MONTH(cal.date) as cmonth, YEAR(cal.date) as cyear
FROM (
SELECT '2005-01-01' + INTERVAL d.i*1000 + c.i* 100 + a.i * 10 + b.i DAY as date
FROM ints a JOIN ints b JOIN ints c JOIN ints d
ORDER BY d.i*1000 + c.i*100 + a.i*10 + b.i) cal
WHERE cal.date BETWEEN '2005-01-01' AND '2030-12-31'
*/
