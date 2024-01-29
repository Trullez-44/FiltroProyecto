DROP DATABASE IF EXISTS Naruto_KevinCorzo;
CREATE DATABASE IF NOT EXISTS Naruto_KevinCorzo;
USE Naruto_KevinCorzo;
CREATE TABLE IF NOT EXISTS`MisionNinja`(
    `ID_Ninja` BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `ID_Mision` BIGINT NOT NULL,
    `FechaInicio` DATETIME NOT NULL,
    `FechaFin` DATETIME
);
CREATE TABLE IF NOT EXISTS`Ninja`(
    `ID` BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `Nombre` VARCHAR(255) NOT NULL,
    `Rango` VARCHAR(255) NOT NULL,
    `Aldea` VARCHAR(255) NOT NULL
);
CREATE TABLE IF NOT EXISTS`Habilidad`(
    `ID_Ninja` BIGINT NOT NULL,
    `Nombre` VARCHAR(255) NOT NULL,
    `Descripcion` VARCHAR(255) NOT NULL
);
CREATE TABLE IF NOT EXISTS`Mision`(
    `ID` BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `Descripcion` VARCHAR(255) NOT NULL,
    `Rango` VARCHAR(255) NOT NULL,
    `Recompensa` VARCHAR(255) NOT NULL
);
ALTER TABLE
    `MisionNinja` ADD CONSTRAINT `ninja_id_foreign_mision` FOREIGN KEY(`ID_Ninja`) REFERENCES `Ninja`(`ID`);
ALTER TABLE
    `Habilidad` ADD CONSTRAINT `ninja_id_foreign_abi` FOREIGN KEY(`ID_Ninja`) REFERENCES `Ninja`(`ID`);
ALTER TABLE
    `MisionNinja` ADD CONSTRAINT `misionninja_id_mision_foreign` FOREIGN KEY(`ID_Mision`) REFERENCES `Mision`(`ID`);

-- INSERTS

INSERT INTO Ninja VALUES (1,"Juan Mariño", "Challenger", "Aldea escondida entre Zona Franca"),(2,"Juan Guiza", "Hierro", "Aldea escondida entre la niebla"), (3,"Juan Torra", "Diamante", "Aldea escondida entre la parla"), (4,"Juan David", "Oro", "Aldea escondida entre el vicio");
INSERT INTO Mision VALUES(1, "Enseñar Java sin morir en el intento", "Challenger", "Cule estudiante makias:)"),(2, "Estar callao mientras lee", "Hierro", "Nada"),(3, "No parlarse a Julie Cristina Jerez Salas una vez a la semana", "Diamante", "Un aplauso"),(4, "Salir de oro en el ligoleyens", "Oro", "Felicidades Shinji");
INSERT INTO Habilidad VALUES(1, "LeadTech in Java", "Ser la mondá en Java"),(2, "Sprint", "Tirar cule sprint en cicla"), (3, "Parla", "Parla efectiva +50 pts"),(4, "Hikikomori", "Vive sin preocuparse");
INSERT INTO MisionNinja VALUES(1,1,"2024-01-01 10:10:10",NULL),(2,2,"2024-01-01 10:10:10",NULL),(3,3,"2024-01-01 10:10:10",NULL),(4,4,"2024-01-01 10:10:10",NULL);