create table funcionario(
    idfuncionario serial not null,
    rmfuncionario int,
    nomefuncionario varchar(50),
    enderecofuncionario varchar(50),
    telefonefuncionario varchar(11),
    constraint pk_funcionario primary key(idfuncionario)
);