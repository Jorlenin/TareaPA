        #drop database Carros;
        create database if not exists Carros;
        use Carros;
        
        create table if not exists Carro(
        ID_Carro int not null auto_increment,
        NombreCarro char (10) not null,
        ModeloCarro char(30) not null,
        TipoCarro char(30) not null,
        observacion varchar(90),
        primary key(ID_Carro))
        ENGINE = InnoDB;
        
        SET SQL_SAFE_UPDATES = 0;
        
		create table if not exists Agencia(
        ID_Agencia int not null,
        NombreAgencia char(30) not null,
        Ubicacion char(30) not null, 
        Telefono varchar(90),
        primary key(ID_Agencia))
        ENGINE = InnoDB;
        
		create table if not exists Cliente(
        ID_Cliente int not null,
        cedula char(10) not null,
        Nombre char(30) not null,
        Apellido char(30) not null,
        Telefono char(10) not null,
        primary key(ID_Cliente))
        ENGINE = InnoDB;
        