create database projetojava;
use projetojava;
CREATE TABLE usuario (
    id BIGINT(10) AUTO_INCREMENT,
    nome VARCHAR(255),
    cpf VARCHAR(255),
    email VARCHAR(255),
    telefone VARCHAR(255),
    tel_fixo VARCHAR(255),
    nascimento VARCHAR(255),
    estado_civil VARCHAR(255),
    genero VARCHAR (255),
    
    PRIMARY KEY (id)
);
SELECT * FROM usuario;
drop table usuario;