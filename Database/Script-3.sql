/* 1) "Listar todos os livros que n�o tem editora informada" */

select * from livros where codigoeditora is null;

/* ?2) "Listar todos os livros que est�o vinculados a 
       editoras que n�o existem." */

select * from livros left join editora
on livros.codigoeditora = editora.codigoeditora
where editora.codigoeditora is null and livros.codigoeditora is not null;


--select * from livros where livros.codigoeditora not in (select editora.codigoeditora from editora);

/* 3) "Listar todos os livros que est�o sem editora, seja porque n�o foi informado uma editora ao cadastrar o livro, seja porque ele est� vinculado a uma editora  que n�o existe." */

select * from livros left join editora 
on livros.codigoeditora = editora.codigoeditora
where editora.codigoeditora is null;

/* 4) "Lista pra mim todos os empr�stimos feitos para alunos que n�o possuem CPF informado em seu cadastro" */

select *
from alunos
left join emprestimo
on emprestimo.numeromatriculoaluno = alunos.numeromatriculaaluno 
where alunos.cpf is null and emprestimo.numeromatriculaaluno is not null;

/* 5) "Lista pra mim todos os empr�stimos de livros, com o nome do livro e o nome do 
       aluno que pegou o livro emprestado." */
       
   
  select 
  emprestimo.codigoemprestimo ,
  livros.codigolivro ,
  livros.nomelivro ,
  alunos.nome 
  from emprestimo 
  left join livros on livros.codigolivro = emprestimo.codigolivro 
  left join alunos on alunos.numeromatriculaaluno = emprestimo.numeromatriculoaluno;
 
 /* 6) "Lista pra mim a quantidade de alunos cadastrados por bairro, 
       ordernando de modo decrescente por bairro. " */
 
 
Select bairro, Count(*) as Quantidade_de_alunos From Alunos  Group by Bairro order by quantidade_de_alunos desc;

insert into alunos (nome, datanascimento,bairro) values ('lucas', '1990-05-31', 'Olaria'),('fred', '1990-05-31', 'Olaria'),('lilica', '1990-05-31', 'Olaria');

/* 7) "Lista pra mim a quantidade de livros emprestados por bairro,
       considerando apenas os empr�stimos feitos para alunos que tem cpf." */

select
	alunos.bairro ,
	count(emprestimo.numeromatriculoaluno) as emprestimo_contador_aluno
from
	emprestimo
left join alunos on
	alunos.numeromatriculaaluno = emprestimo.numeromatriculoaluno
where
	alunos.cpf is not null
group by
	alunos.bairro;


 
 