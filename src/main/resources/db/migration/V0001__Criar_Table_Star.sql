create table cadastro (
       id bigint not null auto_increment,
        ativo bit,
        endereco varchar(255),
        nome varchar(255),
        primary key (id)
    ) engine=InnoDB default charset=utf8MB4;

    create table endereco (
       id integer not null auto_increment,
        bairro varchar(255),
        cep varchar(255),
        cidade varchar(255),
        complemento varchar(255),
        estado varchar(255),
        logradouro varchar(255),
        numero varchar(255),
        primary key (id)
    ) engine=InnoDB default charset=utf8MB4;

    create table permissao (
       id bigint not null auto_increment,
        descricao varchar(255),
        primary key (id)
    ) engine=InnoDB default charset=utf8MB4;

    create table usuario (
       id integer not null auto_increment,
        email varchar(255),
        nome varchar(255),
        senha varchar(255),
        primary key (id)
    ) engine=InnoDB default charset=utf8MB4;

    create table veiculo (
       id integer not null auto_increment,
        acessorios varchar(255),
        marca varchar(255),
        modelo varchar(255),
        primary key (id)
    ) engine=InnoDB default charset=utf8MB4;