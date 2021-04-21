create database db_escola;

use db_escola;

create table tb_alune 
(
	id bigint (3) auto_increment,
    nome varchar (80) not null,
    turma bigint (3) not null,
    idade bigint (3) not null,
    pronomes varchar (10) not null,
    nota decimal (6,2) not null,
    
    primary key (id)
);

insert into alunes (nome, turma, idade, pronomes, nota) values ("Isac Bianor", 20, 18, "elu", 10);

insert into alune (nome, turma, idade, pronomes, nota) values ("Lizandra Linda", 20, 27, "ela", 10);

insert into alune (nome, turma, idade, pronomes, nota) values ("Carolina", 20, 24, "ela", 10);

insert into alune (nome, turma, idade, pronomes, nota) values ("Arthur", 21, 29, "ele", 4.05);

insert into alune (nome, turma, idade, pronomes, nota) values ("Pocahs Palavras", 21, 26, "ela", 0.01);

insert into alune (nome, turma, idade, pronomes, nota) values ("Juliette", 21, 29, "ela", 10);

insert into alune (nome, turma, idade, pronomes, nota) values ("João Luiz", 21, 31, "ele", 6.40);

insert into alune (nome, turma, idade, pronomes, nota) values ("Camilla de Lucas", 21, 26, "ela", 8.2);

select * from tb_alune where nota > 7;
select * from tb_alune where nota < 7;

update tb_alune set nota = 1.02 where id (4)