create database lojinha;

--Criação da tabela com informações do usuario
create table usuario (
	codigoUsuario serial not null primary key, 
	nome varchar(100) not null, 
	sobrenome varchar(100) not null,
	celularUsuario int not null,
	nomeUsuario varchar(20) not null unique,
	emailUsuario varchar(100) not null unique,
	cpfUsuario int not null unique,
	dataDeNascimento date not null
);

alter table usuario alter column celularUsuario type char(11);
alter table usuario alter column cpfusuario type char(11);

--Criação da tabela de endereços
create table endereco (
	codigoEndereco serial not null primary key,
	codigoUsuario int not null references usuario (codigoUsuario),
	rua varchar (100) not null,
	cidade varchar (100) not null,
	estado varchar (100) not null,
	complemento varchar (100) not null,
	numero int not null
);

alter table endereco add CEP char(8) not null;

--Criação da tabela de produtos
create table produto (
	codigoProduto serial not null primary key,
	nomeProduto varchar(100) not null,
	descricaoProduto varchar (300) default 'Não há descrição do produto',
	dataFabricacao date not null,
	qtdEstoque int not null,
	valorUnitário money not null,
	codigoUsuario int not null references usuario (codigoUsuario),
	codigoCategoria int not null references categoria (codigoCategoria)
);

--Criação da tabela de compra
create table compra (
	compra serial not null primary key,
	codigoProduto int not null references produto (codigoProduto),
	codigoPedido int not null references pedido (codigoPedido)
);

--Criação da tabela de pedido
create table pedido (
	codigoPedido serial not null primary key,
	dataDoPedido date not null,
	codigoUsuario int not null references usuario (codigoUsuario)
);

--Criação da tabela de categorias
create table categoria (
	codigoCategoria serial not null primary key,
	nomeCategoria varchar (100) not null unique,
	descricaoCategoria varchar(300)
);


