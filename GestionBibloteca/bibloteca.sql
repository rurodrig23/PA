CREATE TABLE Autor (
    id INT PRIMARY KEY,
    nom VARCHAR(50),
    cognom VARCHAR(50)
);

CREATE TABLE Llibre (
    id INT PRIMARY KEY,
    titol VARCHAR(100),
    anyPublicacio INT,
    autorId INT,
    FOREIGN KEY (autorId) REFERENCES Autor(id)
);


INSERT INTO Autor VALUES (1, 'Ruben', 'Rodriguez');
INSERT INTO Llibre VALUES (1, '2003', 2003, 1);