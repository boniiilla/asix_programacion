DROP DATABASE IF EXISTS books;
CREATE DATABASE IF NOT EXISTS books;

USE books;

CREATE TABLE llibre (
    id INT PRIMARY KEY,
    nom VARCHAR(24)
);