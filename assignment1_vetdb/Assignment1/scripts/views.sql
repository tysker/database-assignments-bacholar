DROP VIEW IF EXISTS Pets_view;
DROP VIEW IF EXISTS Dogs_view;
DROP VIEW IF EXISTS Cats_view;

CREATE OR REPLACE VIEW Cats_view AS 
	SELECT p.id, p.name, p.age, p.vet_cvr, c.life_count
	FROM pets p
	INNER JOIN cats c
	ON p.id = c.id;

CREATE OR REPLACE VIEW Dogs_view AS 
	SELECT p.id, p.name , p.vet_cvr, p.age, d.bark_pitch 
	FROM Pets p
	INNER JOIN Dogs d
	ON p.id = d.id;


CREATE OR REPLACE VIEW Pets_view AS
	SELECT p.id, p.name , p.vet_cvr, p.age, d.bark_pitch, c.life_count 
	FROM pets p
	LEFT JOIN dogs d
	ON p.id = d.id 
	LEFT JOIN cats c
	ON p.id = c.id;

--SELECT * FROM Pets_view;
--SELECT * FROM Cats_view;
--SELECT * FROM Dogs_view;
