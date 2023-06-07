create table medico(
	idmedico serial not null,
	nome varchar(50) not null,
	endereco varchar(50) not null,
	especialidade varchar(50) not null,
	crm varchar(13) not null,
	constraint pk_idmedico primary key (idmedico)
);