create table if not exists tb_usuario (
    codigo serial not null,
    identificador varchar(200) not null,
    senha varchar(200) not null,
    constraint pk_usuario_codigo primary key (codigo),
    constraint un_usuario_identificador unique (identificador)
);