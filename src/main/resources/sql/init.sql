

INSERT INTO USUARIOS (nombre, dni, password, actividad) VALUES ('ADMIN','1010',1010, 'ADMIN');

INSERT INTO USUARIOS (nombre, dni, password, actividad) VALUES ('DANIEL','1',1, 'MEDICO');
INSERT INTO USUARIOS (nombre, dni, password, actividad) VALUES ('DANI','2',2, 'MEDICO');
INSERT INTO USUARIOS (nombre, dni, password, actividad) VALUES ('DAVID','3',3, 'ENFERMERO');
INSERT INTO USUARIOS (nombre, dni, password, actividad) VALUES ('DIEGO','48979318B',123456, 'ENFERMERO');
INSERT INTO USUARIOS (nombre, dni, password, actividad) VALUES ('ANDREA','4',4, 'PACIENTE');
INSERT INTO USUARIOS (nombre, dni, password, actividad) VALUES ('MARIO','48979318D',123456,'PACIENTE');
INSERT INTO USUARIOS (nombre, dni, password, actividad) VALUES ('LUISA','48979318E',123456,'PACIENTE');
INSERT INTO USUARIOS (nombre, dni, password, actividad) VALUES ('ELENA','48979318F',123456,'PACIENTE');


INSERT INTO MEDICOS (idUsuario, apellido1, apellido2,dni) VALUES (3,'RE','PO','22');
INSERT INTO MEDICOS (idUsuario, apellido1, apellido2,dni) VALUES (2,'REYES','PONCE','11');

INSERT INTO PACIENTES (idusuario, apellido1, apellido2, grupoSanguineo, fechaIngreso, fechaAlta, diagnostico, enfermeroAsignado, medicoAsignado, tratamiento, recetas) VALUES (6,'RUMANIA','ESTOCOLMO','0+','2023-01-21','2023-01-30','DIVERTICULITIS',1,1,'OPERACION','PARACETAMOL');
INSERT INTO PACIENTES (idusuario, apellido1, apellido2, grupoSanguineo, fechaIngreso, fechaAlta, diagnostico, enfermeroAsignado, medicoAsignado, tratamiento, recetas) VALUES (7,'FRANCIA','ESTOCOLMO','0-','2023-02-22','2023-02-26','DIVERTICULITIS',2,2,'OPERACION','PARACETAMOL');
INSERT INTO PACIENTES (idusuario, apellido1, apellido2, grupoSanguineo, fechaIngreso, fechaAlta, diagnostico, enfermeroAsignado, medicoAsignado, tratamiento, recetas) VALUES (8,'ESPAÑA','ESTOCOLMO','A+','2023-02-23','2023-03-27','DIVERTICULITIS',1,1,'OPERACION','PARACETAMOL');
INSERT INTO PACIENTES (idusuario, apellido1, apellido2, grupoSanguineo, fechaIngreso, fechaAlta, diagnostico, enfermeroAsignado, medicoAsignado, tratamiento, recetas) VALUES (9,'PORTUGAL','ESTOCOLMO','B+','2023-04-24','2023-04-28','DIVERTICULITIS',22,2,'OPERACION','PARACETAMOL');


INSERT INTO OPERACIONES (idMedico,idPaciente,fechaOperacion) VALUES (2,1, '2023-01-28');
INSERT INTO OPERACIONES (idMedico,idPaciente,fechaOperacion) VALUES (1,2,'2023-02-28');
INSERT INTO OPERACIONES (idMedico,idPaciente,fechaOperacion) VALUES (2,3, '2023-03-28');
INSERT INTO OPERACIONES (idMedico,idPaciente,fechaOperacion) VALUES (1,4,'2023-04-28');

INSERT INTO ENFERMEROS (idusuario, apellido1, apellido2) VALUES (4,'ENFERMERO','ENFERMERO');
INSERT INTO ENFERMEROS (idusuario, apellido1, apellido2) VALUES (5,'ENFERMERO','ENFERMERO');

