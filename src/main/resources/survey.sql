CREATE TABLE survey
(
   id INT NOT NULL AUTO_INCREMENT,
   age INT NOT NULL,
   satisfaction INT NOT NULL,
   comment VARCHAR(100),
   created DATETIME NOT NULL,
   PRIMARY KEY(id)
);