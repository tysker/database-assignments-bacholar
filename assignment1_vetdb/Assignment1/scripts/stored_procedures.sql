-- Stored procedures:
--drop procedure update_cat;


-- Update Cat 
CREATE OR REPLACE PROCEDURE update_cat(cat_id integer, new_name varchar, lifes integer) 
	AS $$
	BEGIN 
		UPDATE Pets 
			SET name = new_name where id = cat_id;
		UPDATE Cats 
			SET life_count = lifes where id = cat_id;
	END$$
language plpgsql;


-- Update Cat name
CREATE OR REPLACE PROCEDURE update_cat(cat_id integer, new_name varchar) 
	AS $$
	BEGIN 
		UPDATE Pets 
			SET name = new_name where id = cat_id;
	END$$
language plpgsql;


-- Update dog
CREATE OR REPLACE PROCEDURE update_dog(dog_id integer, new_name varchar, new_bark_pitch varchar) 
	AS $$
	BEGIN 
		UPDATE Pets 
			SET name = new_name where id = dog_id;
		UPDATE Dogs 
			SET bark_pitch = new_bark_pitch where id = dog_id;
	END$$
language plpgsql;


-- Insert pet
CREATE OR REPLACE PROCEDURE insert_pet(new_name varchar, new_age int, new_cvr int) 
	AS $$
	BEGIN 
		INSERT INTO Pets (name, age, vet_cvr) values(new_name, new_age, new_cvr);
	END$$
language plpgsql;




-- Insert dog
CREATE OR REPLACE PROCEDURE insert_dog(new_name varchar, new_age int, new_cvr int, new_bark_pitch char(2)) 
	AS $$
	BEGIN 
		WITH new_dog AS (
		INSERT INTO Pets (name, age, vet_cvr) values(new_name, new_age, new_cvr) returning id
		)
		INSERT INTO Dogs (id, bark_pitch) select id, new_bark_pitch from new_dog;
	END$$
language plpgsql;


-- Insert cat
CREATE OR REPLACE PROCEDURE insert_cat(new_name varchar, new_age int, new_cvr int, new_life_count int) 
	AS $$
	BEGIN 
		WITH new_cat AS (
		INSERT INTO Pets (name, age, vet_cvr) values(new_name, new_age, new_cvr) returning id
		)
		INSERT INTO Cats (id, life_count) select id, new_life_count from new_cat;
	END$$
language plpgsql;


--call insert_cat('Multeberg', 5, 15478536, 8);
--select * from Cats_view;
--call update_cat(13, 'Kisser H');
--select * from cats_view;


--call insert_dog('Tot', 1, 15478536, 'A4');
--select * from Dogs_view;

--call insert_pet('Loller', 11, 15478536);
--select * from pets;

--call update_dog(9, 'Couscous', 'b2');
--select * from dogs_view;