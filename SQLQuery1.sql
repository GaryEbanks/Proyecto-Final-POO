create database BDAutoEstudio
go

use BDAutoEstudio
go

create table Semestre(
	id int primary key identity(1, 1)
	, nombreSemestre varchar(30)
)

go

create table Estudiante(
	carnet varchar(9) primary key
	, nombres varchar(30)
	, apellidos varchar(30)
	, carrera varchar(30)
	, email varchar(100)
	, pw varchar(100)
)
go

create table Materia(
	codigo varchar(30) primary key 
	, nombre varchar(60)
	, creditos int
	, horasAutoEst int
)
go

Create table Control(
	id int primary key identity (1, 1)
	, materia varchar(30) foreign key references Materia(codigo)
	, estudiante varchar(9) foreign key references Estudiante(carnet)
	, horaInicio datetime
	, horafin datetime
)