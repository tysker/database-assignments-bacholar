DROP SEQUENCE IF EXISTS petsequence;
DROP TABLE IF EXISTS Pets_Caretakers;
DROP TABLE IF EXISTS Dogs CASCADE;
DROP TABLE IF EXISTS Cats CASCADE;
DROP TABLE IF EXISTS Pets CASCADE;
DROP TABLE IF EXISTS Caretakers;
DROP TABLE IF EXISTS Vets CASCADE;
DROP TABLE IF EXISTS Cities;
DROP TYPE IF EXISTS species;


CREATE SEQUENCE PetSequence;

/*

CREATE TYPE species as enum (
	'CAT',
	'DOG'
);
*/

CREATE TABLE IF NOT EXISTS Cities (
	zip_code int PRIMARY KEY,
	name varchar(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS Vets (
	cvr int PRIMARY KEY,
	name varchar(80) NOT NULL,
	street varchar(100) NOT NULL,
	zip_code int REFERENCES Cities NOT NULL	
);

Create TABLE IF NOT EXISTS Pets (
	id SERIAL PRIMARY KEY,
	name varchar(80) NOT NULL,
	age int NOT NULL,
	vet_cvr int references Vets(cvr) NOT NULL
);

CREATE TABLE IF NOT EXISTS Cats (
	id int PRIMARY KEY REFERENCES Pets,
	life_count int DEFAULT(9)
);

CREATE TABLE IF NOT EXISTS Dogs(
	id int PRIMARY KEY REFERENCES Pets,
	bark_pitch char(2)
);

CREATE TABLE IF NOT EXISTS Caretakers(
	id SERIAL PRIMARY KEY,
	name varchar(80) NOT NULL,
	street varchar(100) NOT NULL,
	zip_code int REFERENCES Cities NOT NULL
);

CREATE TABLE IF NOT EXISTS Pets_Caretakers(
	caretaker_id SERIAL REFERENCES Caretakers (id) ON DELETE CASCADE,
	pet_id SERIAL REFERENCES Pets (id) ON DELETE CASCADE,
	CONSTRAINT pet_product_pkey PRIMARY KEY (caretaker_id, pet_id)
);

/* VIEWS
CREATE OR REPLACE VIEW CATS AS SELECT P.*, C.lifeCount FROM PET_DATA AS P JOIN CAT_DATA as C on P.id = C.id;
CREATE OR REPLACE VIEW DOGS AS SELECT P.*, D.barkPitch FROM PET_DATA AS P JOIN DOG_DATA as D on P.id = D.id;

CREATE OR REPLACE VIEW PETS AS	SELECT P.*, C.lifeCount, D.barkPitch FROM PET_DATA as P 
	LEFT OUTER JOIN CAT_DATA as C on P.id = C.id
	LEFT OUTER JOIN DOG_DATA as D on P.id = D.id; */

