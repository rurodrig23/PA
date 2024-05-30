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

INSERT INTO Director(nom, cognom) VALUES('pepito', 'rodriguez');

INSERT INTO Pelicula(titol, anyEstrena, directorId) VALUES(' piratas del caribe', '2012-02-13', 1);