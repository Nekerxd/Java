create table usuario (
	idUsuario serial primary key,
	loginusuario varchar(50) not null,
	nomeusuario varchar(50) not null,
	emailusuario varchar(100) not null,
	senhausuario varchar(64) not null
);

insert into usuario(nomeusuario, loginusuario, emailusuario, senhausuario) 
	values ('Matheus', 'Nekerxd','matheus.carvalho37@fatec.sp.gov.br', 'aab18c5e903095e9acbdd3702e79d48399dc566dcb2f002d669fa96af5a8d126');
insert into usuario(nomeusuario, loginusuario, emailusuario, senhausuario)
	values ('Natanael', 'ReiNatinha','natanael.santos2@fatec.sp.gov.br', 'ff93726aea4b421be8747b76b74a29a10ada9811ea8e861d4bd24a7bf21909d8');

create table banco (
	idBanco serial primary key,
	nomebanco varchar(100) not null
);

insert into banco(nomebanco) values ('Banco do Brasil');
insert into banco(nomebanco) values ('Nubank');

create table meta(
    idMeta serial primary key,
    descMeta varchar(100),
    tipoMeta varchar(50) not null,
    prazoMeta date not null,
    valorMeta numeric not null,
    idUsuario int not null,
    constraint fk_usuarioMeta foreign key (idUsuario) references usuario(idUsuario)
);

insert into meta(descMeta, tipoMeta, prazoMeta, valorMeta, idUsuario) values ('Realizar trabalhos como freelancer', 'Receita', '2023-05-11', '3700', 2);
insert into meta(descMeta, tipoMeta, prazoMeta, valorMeta, idUsuario) values ('Economizar para viajar no fim de ano', 'Despesa', '2023-05-11', '2500.0', 1);

create table conta(
    idConta serial primary key,
    descConta varchar(100),
    saldoConta numeric,
    limiteConta numeric,
    tipoConta varchar(50),
    idBanco int not null,
    idUsuario int not null,
    constraint fk_bancoConta foreign key (idBanco) references banco(idBanco),
    constraint fk_usuarioConta foreign key (idUsuario) references usuario(idUsuario)
);

insert into conta(descConta, saldoConta, limiteConta, tipoConta, idBanco, idUsuario) 
    values ('Betano',1950.47, 5000.0, 'Corrente', 1, 2);
insert into conta(descConta, saldoConta, limiteConta, tipoConta, idBanco, idUsuario) 
    values ('Roxinha',1568.47, 3675.0, 'Poupança', 2, 1);

select * from usuario;
select * from banco;
select * from meta;
select * from conta;