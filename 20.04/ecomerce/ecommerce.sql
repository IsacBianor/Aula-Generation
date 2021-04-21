/*Crie um banco de dados para um e commerce, onde o sistema trabalhará com as
informações dos produtos deste ecommerce.
Crie uma tabela produtos e utilizando a habilidade de abstração e determine 5 atributos
relevantes dos produtos para se trabalhar com o serviço deste ecommerce.
Popule esta tabela com até 8 dados;
Faça um select que retorne os produtos com o valor maior do que 500.
Faça um select que retorne os produtos com o valor menor do que 500.
Ao término atualize um dado desta tabela através de uma query de atualização.
salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e
coloque no seu GitHuB pessoal e compartilhe esta atividade.*/

-- CREATE DATABASE db_ecommerce

/*use db_ecommerce;

create table tb_produto
(
	id bigint (4) auto_increment,
    nome varchar (21) not null,
    categoria varchar (12) not null,
    marca varchar (16) not null, 
    tamanho varchar (2) not null,
	valor decimal (5,2) not null,
    
    primary key (id)
)*/

/*INSERT INTO tb_produto (nome, categoria, marca, tamanho, valor) VALUES ("Camisa PINK", "Camiseta", "SHEIN", "XL", 15.99);
INSERT INTO tb_produto (nome, categoria, marca, tamanho, valor) VALUES ("I Got It", "Camiseta", "SHEIN", "GG", 12.99);
INSERT INTO tb_produto (nome, categoria, marca, tamanho, valor) VALUES ("Into You", "Camiseta", "SHEIN", "XL", 14.99);
INSERT INTO tb_produto (nome, categoria, marca, tamanho, valor) VALUES ("Coleção 10 Rare", "Camisetta", "SHEIN", "G", 129.99);
INSERT INTO tb_produto (nome, categoria, marca, tamanho, valor) VALUES ("Coleção 18 Verão", "Vestido", "SHEIN", "GG", 279.99)*/

-- select *  from tb_produto where valor > 500;

-- select * from tb_produto where valor< 500

-- update tb_produto set categoria = "Camiseta" where id = 4
 
 select * from tb_produto