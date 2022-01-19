--Arquivo de comandos
--
create table Pessoa(
    id bigserial primary key,
    nome varchar(250) not null,
    cpf varchar unique not null,
    data_nascimento date,
    data_insercao timestamp,
    data_atualizacao timestamp,
    ativo boolean
);