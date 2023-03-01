DROP TABLE IF EXISTS ENFERMEROS;
DROP TABLE IF EXISTS OPERACIONES;
DROP TABLE IF EXISTS PACIENTES;
DROP TABLE IF EXISTS MEDICOS;
DROP TABLE IF EXISTS USUARIOS;

CREATE TABLE IF NOT EXISTS  USUARIOS (

   id INT auto_increment primary key,
   nombre VARCHAR(50) NOT NULL,
   dni VARCHAR(9) NOT NULL UNIQUE,
   password INT NOT NULL,
   actividad VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS  MEDICOS (
   id INT auto_increment primary key,
   idUsuario INT NOT NULL,
   apellido1 VARCHAR(50) NOT NULL,
   apellido2 VARCHAR(50) NOT NULL,
   dni VARCHAR(9) NOT NULL,
   FOREIGN KEY (idUsuario) REFERENCES USUARIOS(id)
);

CREATE TABLE IF NOT EXISTS  PACIENTES (
   id INT auto_increment primary key,
   idUsuario INT NOT NULL,
   apellido1 VARCHAR(50) NOT NULL,
   apellido2 VARCHAR(50) NOT NULL,
   grupoSanguineo VARCHAR(5) NOT NULL,
   fechaIngreso DATE NOT NULL,
   fechaAlta DATE NOT NULL,
   diagnostico VARCHAR(50) NOT NULL,
   enfermeroAsignado INT NOT NULL,
   medicoAsignado  INT NOT NULL,
   tratamiento VARCHAR(50) NOT NULL,
   recetas VARCHAR(50) NOT NULL,
   FOREIGN KEY (idUsuario) REFERENCES USUARIOS(id),
   FOREIGN KEY (medicoAsignado) REFERENCES MEDICOS(id)
);

CREATE TABLE IF NOT EXISTS  OPERACIONES (
   id INT auto_increment primary key,
   idMedico INT NOT NULL,
   idPaciente INT NOT NULL,
   fechaOperacion DATE NOT NULL,
   FOREIGN KEY (idMedico) REFERENCES MEDICOS(id),
   FOREIGN KEY (idPaciente) REFERENCES PACIENTES(id)
);

CREATE TABLE IF NOT EXISTS  ENFERMEROS (
   id INT auto_increment primary key,
   idUsuario INT NOT NULL,
   apellido1 VARCHAR(50) NOT NULL,
   apellido2 VARCHAR(50) NOT NULL,
    FOREIGN KEY (idUsuario) REFERENCES USUARIOS(id)


);
