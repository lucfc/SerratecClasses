create table alunos 
(
numeromatriculaaluno serial not null primary key,
nome varchar(100) not null,
datanascimento date,
cpf char(11) null unique
);

create table livros
(
codigolivro serial not null primary key,
nomelivro varchar(50) not null
);

create table emprestimo
(
codigoemprestimo serial not null primary key,
numeromatriculaaluno int not null references alunos (numeromatriculaaluno),
codigolivro int not null references livros (codigolivro),
dataemprestimo date not null default now()
);

create table  editora 
(
codigoeditora serial not null primary key, 
nome varchar(50) not null
);


drop table if exists alunos;
create table alunos
		(
		NumeroMatriculaAluno serial not null primary key, 
		nome varchar(100) not null,
		DataNascimento date, 
		cpf char(11) null -- unique
		);

create table livros 
(
	codigolivro serial not null primary key,
	nomeLivro varchar(50) not null
);

drop table if exists emprestimo;

create table Emprestimo
(
	codigoEmprestimo serial not null primary key,
	numeroMatriculoAluno int not null references Alunos (numeroMatriculaAluno),
	codigoLivro int not null references Livros (CodigoLivro),
	DataEmprestimo date not null default now()
);

drop table if exists editora;
create table  editora
(
	codigoEditora serial not null primary key,
	nome varchar(50) not null
);

alter table livros add nomeautor varchar(100);
alter table livros add datalancamento date;
alter table livros add codigoISBN int not null;

alter table livros alter column nomelivro type varchar (120);
alter table livros add codigoeditora int not null references editora (codigoeditora);

alter table alunos add logradouro varchar(100);
alter table alunos add numerologradouro varchar(10);
alter table alunos add complemento varchar(50);
alter table alunos add bairro varchar(50);
alter table alunos add cidade varchar(50);

alter table emprestimo add dataentrega date;

insert into alunos (nome, datanascimento) values ('alfedro', '1980-07-20');
insert into alunos (nome, datanascimento) values ('Gilberto', '1984-07-15');

insert into alunos (nome, datanascimento) values ('Astolfo', '1990-05-31'), ('Espiriquidiberto', '1982-10-25'),('Gertudres', '1983-01-18');

insert into editora (codigoeditora, nome) values (100, 'editora1'),(200,'editora2');

insert into livros (codigolivro, nomelivro, codigoisbn, codigoeditora)
values 
(8,'livro 1', 354897, 100), (14, 'livro 2', 546578, 100), (1589, 'livro 3', 15869, 200);

select * from alunos;
select * from editora;
select * from livros;

select * from alunos where datanascimento = '1982-10-25';
select * from alunos where datanascimento >= '1982-10-25';
select * from alunos where datanascimento <= '1982-10-25';

select * from livros where codigoeditora = 100;

select * from livros where codigoeditora = 100 and codigoisbn  = 354897;

-- delete from alunos; 

-- delete from alunos where numeromatriculaaluno > 5;


select * from alunos;
select * from editora;
select * from livros;
select * from emprestimo;


select nomelivro, nomeautor from livros;

insert into emprestimo (numeromatriculoaluno, codigolivro, dataentrega)
values (1, 8, '2020-07-27');

insert into emprestimo (numeromatriculoaluno, codigolivro,dataemprestimo ,dataentrega)
values (2, 8,'2020-07-20' , '2020-07-24');

select * from emprestimo;

select * from alunos;

--alter table alunos add cpf char(11) null unique;

update alunos set cpf = '09284539852' where nome ='Gilberto';

update alunos set cpf = '09284539589', logradouro = 'Rua da Taquara', bairro = 'Centro' where nome = 'Astolfo';

select * from alunos;

update alunos set cpf = '12345678901' where numeromatriculaaluno = 1;

update alunos set cidade = 'Petrópolis';

update alunos set cidade = 'Friburgo' where numeromatriculaaluno  in (1,3,5);

update alunos set bairro ='Centro';

update alunos set bairro ='Olaria' where numeromatriculaaluno = 2; 

update alunos set bairro = 'Itaipava' where numeromatriculaaluno = 4;

select * from alunos;

select * from alunos where numeromatriculaaluno = 3;

select * from alunos where datanascimento >= '1984-07-15';

select * from alunos where datanascimento > '1984-07-15';

select * from alunos where datanascimento <= '1984-07-15';

select * from alunos where cpf is null;

select * from alunos where cpf is not null;

select * from alunos where (datanascimento <='1984-07-15') and (cpf is null);

select * from alunos where (datanascimento < '1982-01-01') or (cpf is null);

select * from alunos where extract (year from datanascimento) <= '1983';




select * from livros where codigoeditora is Null;

insert into editora (nome) values ('editora3');



Insert Into Livros (CodigoLivro, NomeLivro, CodigoISBN, CodigoEditora) 
Values (5894, 'Livro 4', 548, NULL);

Insert Into Livros (CodigoLivro, NomeLivro, CodigoISBN, CodigoEditora) 
Values (58214, 'Livro 6', 5248, 198);

ALTER TABLE PUBLIC.LIVROS DROP COLUMN CODIGOEDITORA;
ALTER TABLE PUBLIC.LIVROS ADD COLUMN CODIGOEDITORA INTEGER NULL;

UPDATE PUBLIC.LIVROS SET CODIGOEDITORA = 100 WHERE CODIGOLIVRO IN (8,14);
UPDATE livros SET codigoeditora = NULL WHERE codigolivro = 1589;

select * from livros



select
	editora.nome,
	editora.codigoeditora ,
	 livros.nomelivro ,
	 livros.codigoeditora
From
  livros left join editora on (editora.codigoeditora = livros.codigoeditora)
 where livros.codigoeditora  is not null and editora.codigoeditora is null;
 		
/* 4) "Lista pra mim todos os empréstimos feitos para alunos que não possuem CPF 
       informado em seu cadastro" */

insert into emprestimo (numeromatriculoaluno, codigolivro, dataentrega)
values (1, 14, '2020-07-27'); 
   
   select 
   alunos.nome,
   alunos.cpf ,
   emprestimo.numeromatriculoaluno ,
   alunos.numeromatriculaaluno,
   alunos.numeromatriculaaluno 
   from
   	 alunos left join emprestimo on (emprestimo.numeromatriculoaluno = alunos.numeromatriculaaluno)
   	where alunos.cpf is null and emprestimo.numeromatriculoaluno  is not null;

   
   
/* 5) "Lista pra mim todos os empréstimos de livros, com o nome do livro e o nome do 
       aluno que pegou o livro emprestado." */
       
   
  select 
  emprestimo.codigolivro ,
  livros.codigolivro ,
  livros.nomelivro ,
  alunos.nome 
  from emprestimo 
  left join livros on livros.codigolivro = emprestimo.codigolivro 
  left join alunos on alunos.numeromatriculaaluno = emprestimo.numeromatriculoaluno;
 

  
      