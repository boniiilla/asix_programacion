DROP DATABASE IF EXISTS cinema;
CREATE DATABASE IF NOT EXISTS cinema;

USE cinema;

CREATE TABLE Director (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(24), 
    cognom VARCHAR(24)
);

CREATE TABLE Pelicula (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titol VARCHAR(24), 
    anyEstrena DATE,
    directorId INT,
    FOREIGN KEY (directorId) REFERENCES Director(id)
);

INSERT INTO Director(nom, cognom) VALUES('Carlos', 'Bonilla');

INSERT INTO Pelicula(titol, anyEstrena, directorId) VALUES('Harry Potter', '2014-05-23', 1);
