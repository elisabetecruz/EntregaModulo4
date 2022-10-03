create database Bahia_tur;

use Bahia_tur;
CREATE TABLE Cliente (
    Cliente_id INTEGER auto_increment PRIMARY KEY,
    Nome VARCHAR(20), 
    Telefone VARCHAR(11),
	Endereco VARCHAR(23),
    Cpf VARCHAR(11),
    fk_Hotel_Hotel_id INTEGER,
    fk_Passagens_Passagens_id INTEGER
);

CREATE TABLE Hotel (
    Hotel_id INTEGER auto_increment PRIMARY KEY,
    CNPJ VARCHAR(11),
    Endereco VARCHAR(23),
    Telefone VARCHAR(11),
    fk_Pacotes_Pacotes_id INTEGER
);

CREATE TABLE Pacotes (
    Pacotes_id INTEGER auto_increment PRIMARY KEY,
    Servisos VARCHAR(10),
    Precos DECIMAL
);

CREATE TABLE Passagens (
    Passagens_id INTEGER auto_increment PRIMARY KEY,
    Preco DECIMAL(5),
    Quantidade BOOLEAN ,
    Destinos VARCHAR(1)
);
 
ALTER TABLE Cliente ADD CONSTRAINT FK_Cliente_2
    FOREIGN KEY (fk_Hotel_Hotel_id)
    REFERENCES Hotel (Hotel_id)
    ON DELETE RESTRICT;
 
ALTER TABLE Cliente ADD CONSTRAINT FK_Cliente_3
    FOREIGN KEY (fk_Passagens_Passagens_id)
    REFERENCES Passagens (Passagens_id)
    ON DELETE RESTRICT;
 
ALTER TABLE Hotel ADD CONSTRAINT FK_Hotel_2
    FOREIGN KEY (fk_Pacotes_Pacotes_id)
    REFERENCES Pacotes (Pacotes_id)
    ON DELETE RESTRICT;