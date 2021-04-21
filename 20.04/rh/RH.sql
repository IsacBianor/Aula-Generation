/*Crie um banco de dados para um serviço de RH de uma empresa, onde o sistema
trabalhará com as informações dos funcionaries desta empresa.
Crie uma tabela de funcionaries e utilizando a habilidade de abstração e determine 5
atributos relevantes dos funcionaries para se trabalhar com o serviço deste RH.
Popule esta tabela com até 5 dados;
Faça um select que retorne os funcionaries com o salário maior do que 2000.
Faça um select que retorne os funcionaries com o salário menor do que 2000.
Ao término atualize um dado desta tabela através de uma query de atualização.*/

-- create database db_RH

/*use db_RH;

create table tb_funcionaries
(
	id bigInt auto_increment,
    nome varchar (50) not null,
    pronomes varchar (10) not null,
    setor varchar (15) not null,
    cargo varchar (40) not null,
    salario decimal (8,2) not null,
    
    primary key (id)
)*/

-- select * from tb_funcionaries

/*INSERT INTO tb_funcionaries (nome, pronomes, setor, cargo, salario) VALUES ("Vitória Tube", "ela", "Cinema", "Atriz Manipuladora", 2100.40);
INSERT INTO tb_funcionaries (nome, pronomes, setor, cargo, salario) VALUES ("Gilberto do Vigor", "ele", "Economia", "Economista que esquece que é economista", 15800.90);
INSERT INTO tb_funcionaries (nome, pronomes, setor, cargo, salario) VALUES ("Pocahs Palavras", "ela", "Musical", "A cantora dos sonhos", 1900.2);
INSERT INTO tb_funcionaries (nome, pronomes, setor, cargo, salario) VALUES ("Arthur", "ele", "Horti Frutti", "Bananão", 1100);
INSERT INTO tb_funcionaries (nome, pronomes, setor, cargo, salario) VALUES ("Juliette", "ela", "Beleza", "Maquiadora e jogadora", 16200.9)*/

/*select * from tb_funcionaries where salario > 2000;

select * from tb_funcionaries where salario < 2000*/

-- update tb_funcionaries set salario = 1450.79 where id = 3
select * from tb_funcionaries