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

drop table emprestimo;

create table Emprestimo
(
	codigoEmprestimo serial not null primary key,
	numeroMatriculoAluno int not null references Alunos (numeroMatriculaAluno),
	codigoLivro int not null references Livros (CodigoLivro),
	DataEmprestimo date not null default now()
);

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
select * from livros where codigoeditora = 100 and codigoisbn = 354897;

delete from alunos where numeromatriculaaluno  > 5;

select *from alunos;

select nomelivro, nomeautor from livros;

insert into emprestimo (numeromatriculoaluno, codigolivro, dataentrega)
values (15, 8, '2020-07-27');

select * from emprestimo;

select * from alunos;

update alunos set cpf = '09284539852' where nome = 'Gilberto';
update alunos set cpf = '09284539589', logradouro = 'Rua da Taquara', bairro = 'Centro' where nome ='astolfo';
update alunos set cpf ='12345678901' where numeromatriculaaluno = 17;

update alunos set cidade = 'Petrópolis';
update alunos set cidade ='Friburgo' where numeromatriculaaluno  in(15,18,19);

update alunos set bairro = 'Centro';
update alunos set bairro ='Olaria' where numeromatriculaaluno = 15;
update alunos set bairro = 'Itaipava' where numeromatriculaaluno = 17;


-- Operadores simples

select * from alunos where numeromatriculaaluno = 15;
select * from alunos where datanascimento >= '1984-07-15';
select * from alunos where datanascimento > '1984-07-15';
select * from alunos where datanascimento <= '1984-07-15';
select * from alunos where datanascimento < '1984-07-15';

-- Trabalhando com nulo

select * from alunos where cpf is null ;
select * from alunos where cpf is not null;

-- operador and e or

select * from alunos where (datanascimento <= '1984-07-15') and (cpf is null);

-- funções de data

select * from alunos where extract (year from datanascimento) <= '1983';
select * from alunos where extract (month from datanascimento) = '07';
select * from alunos where extract (day from datanascimento) = '18';

--count -> quantidade de registros

select count(*) from alunos;
select count(*) as quantidadealunos from alunos;
select count(*) as "quantidade de alunos" from alunos;
select count(*) from alunos where cpf is not null;

-- pegando o menor e o maior valor

select min(datanascimento) as menordata from alunos;
select max(datanascimento) as maiordata from alunos;

select min(datanascimento) as menordata, max(datanascimento) as maiordata from alunos;

-- buscando registros por parte de um conteudo texto (like)

select * from alunos;
select * from alunos where nome like 'b%'; -- tem q começar com esse coisa
select * from alunos where nome like '%b'; -- tem q terminar com essa coisa
select * from alunos where nome like '%b%'; -- tem q ter em algum lugar do texto

select * from alunos where nome like 'Astolfo';
select * from alunos where nome = 'Astolfo';

-- começando a "brinca" com o group by

select min(datanascimento) as menordata from alunos group by cidade;

select cidade, min(datanascimento) as menordata from alunos group by cidade;
select cidade, count(*) as total from alunos group by cidade;

select bairro, count(*) as total from alunos group by bairro;

select bairro, count(*) as total from alunos where cidade = 'Friburgo' group by bairro;

select bairro, cidade, count (*) as total from alunos group by bairro, cidade;


-- ordenação

select * from alunos order by nome asc;
select * from alunos order by nome desc ;

select * from alunos order by nome, bairro;
select * from alunos order by nome, bairro desc ;

-- bate papo sobre views

create view vw_alunosPorBairro as
select bairro, count(*) as total from alunos where cidade = 'Friburgo' group by bairro ;

select * from vw_alunosporbairro;

create view vw_alunosdepetropolis as
select * from alunos where (cidade='Petrópolis');

select * from vw_alunosdePetropolis where bairro = 'Itaipava';















